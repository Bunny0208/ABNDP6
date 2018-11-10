    package com.example.android.abndp6;

    import android.content.Context;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.ArrayAdapter;
    import android.widget.TextView;

    import java.text.ParseException;
    import java.text.SimpleDateFormat;
    import java.util.Date;
    import java.util.List;
    import java.util.Locale;

    public class NewsAdapter extends ArrayAdapter<News> {

        public NewsAdapter(Context context, List<News> NewsItem) {
            super(context, 0, NewsItem);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View listItemView = convertView;
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.list_item, parent, false);
            }


            News currentNewsItem = getItem(position);

            TextView nameView =  listItemView.findViewById(R.id.articleType);
            nameView.setText(currentNewsItem.getName());


            TextView primaryLocationView =  listItemView.findViewById(R.id.primary_location);

            primaryLocationView.setText(currentNewsItem.getWebTitle());

            TextView authorView =  listItemView.findViewById(R.id.author);
            authorView.setText(currentNewsItem.getAuthor());




            TextView locationOffsetView =  listItemView.findViewById(R.id.date);

            locationOffsetView.setText(formatDate(currentNewsItem.getDate()));

            return listItemView;
        }


        private String formatDate(String date) {
            Date dateObject = new Date ();
            try {

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat ( "yyyy-MM-dd", Locale.US );
                dateObject = simpleDateFormat.parse ( date );
            } catch (ParseException e) {
                e.printStackTrace ();
            }
            SimpleDateFormat newDateFormat = new SimpleDateFormat ( "MMM dd, yyyy ", Locale.US );
            String dateFormatted = newDateFormat.format ( dateObject );
            return dateFormatted;
        }
    }