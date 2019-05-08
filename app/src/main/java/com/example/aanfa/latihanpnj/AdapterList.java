package com.example.aanfa.latihanpnj;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class AdapterList extends ArrayAdapter<DataBerita> {

    Context context;
    int resource;

    public AdapterList(Context context, int resource) {
        super(context, resource);

        this.context = context;
        this.resource = resource;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder;
        holder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(resource, parent, false);
            holder = new Holder();
            holder.imageView = convertView.findViewById(R.id.imageView);
            holder.textDate = convertView.findViewById(R.id.textDate);
            holder.textKategori = convertView.findViewById(R.id.textKategori);
            holder.txtDesc = convertView.findViewById(R.id.txtDesc);
            holder.txtTitle = convertView.findViewById(R.id.txtTitle);
            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }


        holder.textDate.setText(getItem(position).getTanggal());
        holder.textKategori.setText(getItem(position).getKategori());
        holder.txtTitle.setText(getItem(position).getTitle());
        holder.txtDesc.setText(getItem(position).getDeskripsi());

        new GetImageUrl(holder.imageView).execute(getItem(position).imageUrl);


        return convertView;

    }

    class Holder {
        ImageView imageView;
        TextView textKategori;
        TextView textDate;
        TextView txtTitle;
        TextView txtDesc;
    }
}
