package com.example.user.hekama.date;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 11/7/2016.
 */

public class AdviceDataSource {
    public List<AdviceItem> findAll(){
 List<AdviceItem> AdviceList = new ArrayList<AdviceItem>();
        AdviceItem advice = AdviceItem.getNew();
        AdviceList.add(advice);
        return AdviceList;


    }
    public boolean update(AdviceItem advice){
        return true;
    }
    public boolean remove(AdviceItem advice){
        return true;
    }

}
