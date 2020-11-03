package pl.damiankoski.androidblogapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.PostsViewHolder> {
    public static class PostsViewHolder extends RecyclerView.ViewHolder {
        public PostsViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    private Context context;

    private String[] titles;
    private String[] authors;

    public PostsAdapter(Context context, String[] titles, String[] authors) {
        this.context = context;
        this.titles = titles;
        this.authors = authors;
    }

    @NonNull
    @Override
    public PostsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PostsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}