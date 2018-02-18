package taufiq.com.ahmad_taufiq_hidayat_1202152178_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;

/**
 * Created by taufiq on 18/02/18.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MenuViewHolder> {

    private final LinkedList<String> mFoodList;
    private final LinkedList<Integer> mPriceList;
    private final LinkedList<Integer> mPhotoList;
    private LayoutInflater mInflater;

    //Constructor untuk menerima value dari variabel
    public RecyclerViewAdapter(Context context, LinkedList<String> foodList, LinkedList<Integer> priceList, LinkedList<Integer> photoList) {
        mInflater = LayoutInflater.from(context);
        this.mFoodList = foodList;
        this.mPriceList = priceList;
        this.mPhotoList = photoList;
    }

    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.list_menu, parent, false);
        return new MenuViewHolder(mItemView, this);
    }

    //Set value ke List Menunya
    @Override
    public void onBindViewHolder(MenuViewHolder holder, int position) {
        String mCurrentFood = mFoodList.get(position);
        Integer mCurrentPrice = mPriceList.get(position);
        Integer mCurrentPhoto = mPhotoList.get(position);
        holder.foodItemView.setText(mCurrentFood);
        holder.priceItemView.setText("Harga: Rp." + mCurrentPrice.toString());
        holder.photoItemView.setImageResource(mCurrentPhoto);
    }

    // melemparkan data nya ke detail menu
    @Override
    public int getItemCount() {
        return mFoodList.size();
    }

    class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final TextView foodItemView;
        public final TextView priceItemView;
        public final ImageView photoItemView;

        final RecyclerViewAdapter mAdapter;

        public MenuViewHolder(final View itemView, RecyclerViewAdapter adapter) {
            super(itemView);
            foodItemView = (TextView) itemView.findViewById(R.id.tv_food);
            priceItemView = (TextView) itemView.findViewById(R.id.tv_price);
            photoItemView = (ImageView) itemView.findViewById(R.id.iv_photo);
            photoItemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Get the position of the item that was clicked.
                    int mPosition = getLayoutPosition();
                    // Use that to access the affected item in mWordList.
                    String food = mFoodList.get(mPosition);
                    Integer price = mPriceList.get(mPosition);
                    Integer photo = mPhotoList.get(mPosition);
                    Intent intent = new Intent(itemView.getContext(), DetailMenu.class);
                    intent.putExtra("food", food);
                    intent.putExtra("price", price);
                    intent.putExtra("photo", photo);
                    itemView.getContext().startActivity(intent);
                }
            });
            this.mAdapter = adapter;
        }

        @Override
        public void onClick(View view) {

        }
    }
}
