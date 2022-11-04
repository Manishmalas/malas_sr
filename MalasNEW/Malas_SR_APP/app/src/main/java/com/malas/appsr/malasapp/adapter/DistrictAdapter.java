package com.malas.appsr.malasapp.adapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.malas.appsr.malasapp.BeanClasses.DistrictListBean;
import com.malas.appsr.malasapp.R;

import java.util.ArrayList;
import java.util.Locale;

public class DistrictAdapter extends BaseAdapter {
    Context mContext;
    private final ArrayList<DistrictListBean> countrylistNew;
    public static ArrayList<DistrictListBean> resultArrayshort=new ArrayList<>();
    public DistrictAdapter(Context mContext, ArrayList<DistrictListBean> citylistNew) {
        this.mContext = mContext;
        this.countrylistNew = citylistNew;
        resultArrayshort.clear();
        resultArrayshort.addAll(citylistNew);
    }


    @Override
    public int getCount() {
        return resultArrayshort.size();
    }

    @Override
    public Object getItem(int position) {
        return resultArrayshort.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("InflateParams")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            holder = new ViewHolder();

            LayoutInflater mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.state_list_textview, null);
            holder.tvName = convertView.findViewById(R.id.textviewstate);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tvName.setText(resultArrayshort.get(position).getDistrictName());
        return convertView;
    }

    private class ViewHolder {

        TextView tvName;


    }



    public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        resultArrayshort.clear();
        if (charText.length() == 0) {

            resultArrayshort.addAll(countrylistNew);
        } else {
            for (int i = 0; i < countrylistNew.size(); i++) {
                String fullname = countrylistNew.get(i).getDistrictName();

                // String firstname = fullname.substring(0, fullname.indexOf(' '));

                if (fullname.toLowerCase(Locale.getDefault()).contains(charText)) {
                    resultArrayshort.add(countrylistNew.get(i));

                }
            }
        }
        notifyDataSetChanged();
    }
}


/*
public class DistrictAdapter extends BaseAdapter {

    Context mContext;
    ArrayList<DistrictListBean> industryList =new ArrayList<>();
    public  static  ArrayList<DistrictListBean>  listforSearch =new ArrayList<>();
    static   boolean[] itemChecked;
    int id;


    public DistrictAdapter(Context mContext, ArrayList<DistrictListBean> industryList) {
        this.industryList=industryList;
        this.mContext=mContext;
        itemChecked = new boolean[industryList.size()];
        listforSearch.clear();
        listforSearch.addAll(industryList);

    }



    @Override
    public int getCount() {
        return listforSearch.size();
    }

    @Override
    public Object getItem(int position) {
        return listforSearch.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {


        LayoutInflater mInflater = (LayoutInflater) mContext.getSystemService(mContext.LAYOUT_INFLATER_SERVICE);
        convertView = mInflater.inflate(R.layout.industry_list_dialog_row, null);
        TextView  tvAttendanceReason = (TextView) convertView.findViewById(R.id.textviewstate);
        final CheckBox checkbox= (CheckBox) convertView.findViewById(R.id.checkBox);


        checkbox.setChecked(false);
        tvAttendanceReason.setText(listforSearch.get(position).getDistrictName());


        if (itemChecked[position])
            checkbox.setChecked(true);
        else
            checkbox.setChecked(false);

        checkbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (checkbox.isChecked()) {
                    itemChecked[position] = true;
                    Constant.itempostionDistrict.add(position);

                } else {
                    itemChecked[position] = false;
                    Constant.itempostionDistrict.remove(Constant.itempostion.size() - 1);

                }

            }
        });

        Constant.itempostionDistrict.clear();



        return convertView;
    }



    public  void filter(String charText) {
        listforSearch=new ArrayList<>();
        charText = charText.toLowerCase(Locale.getDefault());
        listforSearch.clear();
        if (charText.length() == 0) {
            listforSearch.addAll(industryList);
        } else {
            for (int i = 0; i < industryList.size(); i++) {
                String fullname = industryList.get(i).getDistrictName();

                //  String firstname = fullname.substring(0, fullname.indexOf(' '));

                if (fullname.toLowerCase(Locale.getDefault()).contains(charText)) {
                    listforSearch.add(industryList.get(i));

                }

            }
        }
        notifyDataSetChanged();

    }

}


*/
