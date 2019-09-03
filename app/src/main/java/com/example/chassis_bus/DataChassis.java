package com.example.chassis_bus;

import java.util.ArrayList;

public class DataChassis {
    public static String[][] data = new String[][]{
            {"HINO RK8 - 700jt", "http://www.amtransluxurious.com/wp-content/uploads/2015/12/Hino-Air-Suspension-6.jpg"},
            {"HINO RN285 - 790jt", "https://i0.wp.com/imotorium.com/wp-content/uploads/2016/03/rn-285-chassis.jpg?zoom=1.5&resize=678%2C509&ssl=1"},
            {"MercedesBenz OH1526 - 740jt", "https://d2t1xqejof9utc.cloudfront.net/screenshots/pics/766d3b7aff732810496e33e410af5286/large.JPG"},
            {"MercedesBenz OH1626 - 810jt", "https://cdn2.tstatic.net/tribunnews/foto/bank/images/sasis-bus-mercedes-benz-oh-1626_20160302_152551.jpg"},
            {"MercedesBenz O500RF 1836 - 1,1M", "https://2.bp.blogspot.com/-QW3WfFLBZl4/WBQxJGPKArI/AAAAAAAADuM/sh32nt42L8EGfbH6rrz-gqXpPVRQ2YkNgCLcB/s1600/Screenshot_2016-10-28-22-22-35_1.jpg"},
            {"MercedesBenz OC500RF 2542 - 1,5M", "https://3.bp.blogspot.com/-YODliDjzFFU/V32ZZ8tYINI/AAAAAAAAA5E/QdNfk2guMIIOJcJQ9qoRzwLkhoiBaDdDQCLcB/s1600/body.JPG"},
            {"Scania K360IB - 1,3M", "https://3.bp.blogspot.com/-9YhJ8ztyt_8/WBGsB_RL1tI/AAAAAAAADqQ/9Nk4SMBJJgMG47H9jaH7mJ9lHeNoBm9DQCEw/s1600/Screenshot_2016-10-27-14-06-30_1.jpg"},
            {"Scania K410IB - 1,6M", "https://i0.wp.com/imotorium.com/wp-content/uploads/2016/03/scania-k410-8.jpg?w=438&h=278&ssl=1"},
            {"Volvo B11R - 1,7 M", "https://cdn-image.bisnis.com/posts/2018/05/07/792343/sasis-volvo-b11r-euro-6.jpg"},
            {"MAN RR4 - 2,2M", "http://www.lidercamion.com/media/1701/rr4-6x2.jpg"},
    };

    public static ArrayList<Chassis> getListData(){
        ArrayList<Chassis> list = new ArrayList<>();
        for(String[] cData : data){
            Chassis chassis = new Chassis();
            chassis.setNama(cData[0]);
            chassis.setFoto(cData[1]);
            list.add(chassis);
        }
        return list;
    }
}
