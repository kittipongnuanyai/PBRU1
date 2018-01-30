package icepbru.kittipongnuanyai.pbru1;

/**
 * Created by kittipongnuanyai on 1/19/2018 AD.
 */

public class MyData {

    public String[] name() {

        String[] strName = new String[5];
        strName[0] = "Name1";
        strName[1] = "Name2";
        strName[2] = "Name3";
        strName[3] = "Name4";
        strName[4] = "Name5";

        return strName;
    }


    public String[] detail() {
        String[] strDetail = new String[5];
        strDetail[0] = "Detail1";
        strDetail[1] = "Detail2";
        strDetail[2] = "Detail3";
        strDetail[3] = "Detail4";
        strDetail[4] = "Detail5";

        return strDetail;
    }

    public int[] icon() {

        int[] intIcon = {R.drawable.build1, R.drawable.build2,
                R.drawable.build3, R.drawable.build4,
                R.drawable.build5};

        return intIcon;
    }



}//Main class
