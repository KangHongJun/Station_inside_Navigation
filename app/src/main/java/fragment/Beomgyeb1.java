package fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.starmine.station_inside_navigation.Inside_Navigation_test;
import org.starmine.station_inside_navigation.R;

public class Beomgyeb1 extends Fragment {
    ViewGroup viewGroup;
    Button A8,A7,A6,A5,A4,A4_1,A3,A2,A1;
    ImageView b1s1;
    ImageView insideMap_Img;

    ImageView route10,route11,route12,route13,route14,route15,route16,route17,route18,route19;

    int stationnum;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        viewGroup = (ViewGroup) inflater.inflate(R.layout.beomgye_b1, container, false);

        A8 = viewGroup.findViewById(R.id.Arrival8);
        A7 = viewGroup.findViewById(R.id.Arrival7);
        A6 = viewGroup.findViewById(R.id.Arrival6);
        A5 = viewGroup.findViewById(R.id.Arrival5);
        A4 = viewGroup.findViewById(R.id.Arrival4);
        A4_1 = viewGroup.findViewById(R.id.Arrival4_1);
        A3 = viewGroup.findViewById(R.id.Arrival3);
        A2 = viewGroup.findViewById(R.id.Arrival2);
        A1 = viewGroup.findViewById(R.id.Arrival1);
        b1s1 = viewGroup.findViewById(R.id.B1S1);

        insideMap_Img = viewGroup.findViewById(R.id.insideMap_Img);
        route10 = viewGroup.findViewById(R.id.route10);
        route11 = viewGroup.findViewById(R.id.route11);
        route12 = viewGroup.findViewById(R.id.route12);
        route13 = viewGroup.findViewById(R.id.route13);
        route14 = viewGroup.findViewById(R.id.route14);
        route15 = viewGroup.findViewById(R.id.route15);
        route16 = viewGroup.findViewById(R.id.route16);
        route17 = viewGroup.findViewById(R.id.route17);
        route18 = viewGroup.findViewById(R.id.route18);
        route19 = viewGroup.findViewById(R.id.route19);

        route10.setVisibility(View.INVISIBLE);
        route11.setVisibility(View.INVISIBLE);
        route12.setVisibility(View.INVISIBLE);
        route13.setVisibility(View.INVISIBLE);
        route14.setVisibility(View.INVISIBLE);
        route15.setVisibility(View.INVISIBLE);
        route16.setVisibility(View.INVISIBLE);
        route17.setVisibility(View.INVISIBLE);
        route18.setVisibility(View.INVISIBLE);
        route19.setVisibility(View.INVISIBLE);





//        Bitmap bitmap = Bitmap.createBitmap(2000,2000, Bitmap.Config.ARGB_8888);
//        Canvas canvas = new Canvas(bitmap);
//        Paint paint = new Paint();
//        paint.setColor(Color.BLUE);
//        paint.setStrokeWidth(30f);
//        canvas.drawPoint(100,100,paint);


        //insideMap_Img.setImageBitmap(bitmap);

        //Bitmap bitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);

//        Resources resources = getResources();
//        BitmapDrawable bitmapDrawable = (BitmapDrawable)resources.getDrawable(R.drawable.beomgye_b1);
//
//        Bitmap bitmap = bitmapDrawable.getBitmap();
//
//        Canvas canvas = new Canvas(bitmap);
//        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
//        paint.setColor(Color.BLACK);
//        canvas.drawCircle(50, 50, 10, paint);
//        insideMap_Img.setImageBitmap(bitmap);

//        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.beomgye_b1);
//        Paint mpaint = new Paint();
//        mpaint.setColor(Color.GREEN);
//        mpaint.setStrokeWidth(30f);
//
//        Canvas canvas = new Canvas();
//        canvas.drawBitmap(bitmap,50,50,mpaint);
//
//        canvas.drawRect(100, 100, 100, 100, mpaint);
//
//
//
//        insideMap_Img.setImageBitmap(bitmap);





        A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Inside_Navigation_test)getActivity()).setStartSubText("1");
            }
        });

        A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Inside_Navigation_test)getActivity()).setStartSubText("2");
            }
        });

        A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Inside_Navigation_test)getActivity()).setStartSubText("3");
            }
        });

        A4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Inside_Navigation_test)getActivity()).setStartSubText("4");
            }
        });

        A4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Inside_Navigation_test)getActivity()).setStartSubText("4-1");
            }
        });

        A5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Inside_Navigation_test)getActivity()).setStartSubText("5");
            }
        });

        A6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Inside_Navigation_test)getActivity()).setStartSubText("6");
            }
        });

        A7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Inside_Navigation_test)getActivity()).setStartSubText("7");
            }
        });

        A8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Inside_Navigation_test)getActivity()).setStartSubText("8");
            }
        });

        Bundle curstation = getArguments();
        if(curstation != null){
            stationnum = curstation.getInt("stationnum");
        }

        if (stationnum==1){
            setstairColor2();
        }

        return viewGroup;
    }

    public void setstairColor2(){

        b1s1.setBackgroundResource(R.drawable.blue_border);
        A2.setBackgroundResource(R.drawable.circle3);

        route10.setVisibility(View.VISIBLE);
        route11.setVisibility(View.VISIBLE);
        route12.setVisibility(View.VISIBLE);
        route13.setVisibility(View.VISIBLE);
        route14.setVisibility(View.VISIBLE);
        route15.setVisibility(View.VISIBLE);
        route16.setVisibility(View.VISIBLE);
        route17.setVisibility(View.VISIBLE);
        route18.setVisibility(View.VISIBLE);
        route19.setVisibility(View.VISIBLE);
    }
}
