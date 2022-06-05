package com.example.tubesprogmob;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.tubesprogmob.MainActivity2;
import com.example.tubesprogmob.R;
import java.util.ArrayList;
public class listcoelenterataadapter extends RecyclerView.Adapter<listcoelenterataadapter.ViewHolder>{
    private ArrayList<coelenteratamodel> dataKlmp;
    private Context context;
    listcoelenterataadapter(ArrayList<coelenteratamodel>dataKlmp, Context context ){

        this.dataKlmp=dataKlmp;
        this.context = context;
    }

    @NonNull
    @Override

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyleview,parent,false);
        ViewHolder views = new ViewHolder(view);
        return views;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TextView textHead = holder.textHead;
        TextView  textSubhead = holder.textSubhead;
        ImageView imageIcon =holder.gambar;

        textHead.setText(dataKlmp.get(position).getName());
        textSubhead.setText(dataKlmp.get(position).getDetail());
        imageIcon.setImageResource(dataKlmp.get(position).getImage());

        holder.gambar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,dataKlmp.get(holder.getAdapterPosition()).getName() , Toast.LENGTH_LONG).show();
                Intent intent = new Intent(context, MainActivity2.class);
                intent.putExtra("nama",dataKlmp.get(holder.getAdapterPosition()).getName());
                intent.putExtra("keterangan",dataKlmp.get(holder.getAdapterPosition()).getDetail());
                intent.putExtra("gambar",dataKlmp.get(holder.getAdapterPosition()).getImage());

                context.startActivities(new Intent[]{intent});
            }
        });
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textHead;
        TextView textSubhead;
        ImageView gambar;

        public ViewHolder (@NonNull View item){
            super(item);
            textHead=item.findViewById(R.id.names);
            textSubhead=item.findViewById(R.id.keterangans);
            gambar=item.findViewById(R.id.profiles);

        }

    }

    @Override
    public int getItemCount() {
        return dataKlmp.size();
    }

    void setFilter(ArrayList<coelenteratamodel> filterModel) {
        dataKlmp = new ArrayList<>();
        dataKlmp.addAll(filterModel);
        notifyDataSetChanged();
    }
}
