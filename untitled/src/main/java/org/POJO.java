package org;

import java.util.ArrayList;

public class POJO {
    ArrayList<Data> data;
    class Data{
        String type;
        String id;
        Attributes attributes;
        Relationships relationships;
        class Attributes{
            String title;
            String body;
            String created;
            String updated;


        }

        class Relationships{

        }
    }
}
