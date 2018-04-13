package henriet.clement.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>
{
    private List<ListItem> listItems;
    private Context context;
    
    public MyAdapter(List<ListItem> listItems, Context context)
    {
        this.listItems = listItems;
        this.context = context;
    }
    
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new ViewHolder(v);
    }
    
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        //recupère l'objet en cours de la liste grace à sa position
        ListItem listItem = listItems.get(position);
        
        //réupère la valeur du header et de la description dans la liste pour définir le texte des widget associés
        //holder correspond à l'objet qui va être affiché.
        // par exemple l'objet en premiere position aura le header et la description 1 de la liste
        holder.textViewHead.setText(listItem.getHead());
        holder.textViewDesc.setText(listItem.getDescription());
        
        holder.linearLayout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //mettre le code voulu suite à un click sur un objet
            }
        });
    }
    
    @Override
    public int getItemCount()
    {
        //retourne la taille de la liste
        return listItems.size();
    }
    
    
    
    public class ViewHolder extends RecyclerView.ViewHolder
    {
        public TextView textViewHead, textViewDesc;
        public LinearLayout linearLayout
        
        public ViewHolder(View itemView)
        {
            super(itemView);
            
            textViewHead = (TextView) itemView.findViewById(R.id.textViewHead);
            textViewDesc = (TextView) itemView.findViewById(R.id.textViewDescription);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.linearLayout);
        }
    }

}
