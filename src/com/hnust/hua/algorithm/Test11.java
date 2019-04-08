package com.hnust.hua.algorithm;

import java.util.ArrayList;
import java.util.List;

/**  对象数组合并去重
 * Created by Administrator on 2019/3/27.
 */
public class Test11 {

    public static void main(String[] args) {
        List<SqlserverBlockTable> lastList = new ArrayList<>();
        SqlserverBlockTable sqlserverBlockTable1 = new SqlserverBlockTable();
        sqlserverBlockTable1.setSid(1L);
        sqlserverBlockTable1.setLoginName("小明");
        sqlserverBlockTable1.setEventInfo("select");
        lastList.add(sqlserverBlockTable1);

        SqlserverBlockTable sqlserverBlockTable2 = new SqlserverBlockTable();
        sqlserverBlockTable2.setSid(2L);
        sqlserverBlockTable2.setLoginName("小红");
        sqlserverBlockTable2.setEventInfo("create");
        lastList.add(sqlserverBlockTable2);

        SqlserverBlockTable sqlserverBlockTable3 = new SqlserverBlockTable();
        sqlserverBlockTable3.setSid(3L);
        sqlserverBlockTable3.setLoginName("小丽");
        sqlserverBlockTable3.setEventInfo("update");
        lastList.add(sqlserverBlockTable3);


        List<SqlserverBlockTable> list = new ArrayList<>();
        SqlserverBlockTable sqlserverBlockTable4 = new SqlserverBlockTable();
        sqlserverBlockTable4.setSid(2L);
        sqlserverBlockTable4.setLoginName("小红");
        sqlserverBlockTable4.setEventInfo("create");
        list.add(sqlserverBlockTable4);

        SqlserverBlockTable sqlserverBlockTable5 = new SqlserverBlockTable();
        sqlserverBlockTable5.setSid(3L);
        sqlserverBlockTable5.setLoginName("小丽");
        sqlserverBlockTable5.setEventInfo("delete");
        list.add(sqlserverBlockTable5);

        SqlserverBlockTable sqlserverBlockTable6 = new SqlserverBlockTable();
        sqlserverBlockTable6.setSid(4L);
        sqlserverBlockTable6.setLoginName("小张");
        sqlserverBlockTable6.setEventInfo("new");
        list.add(sqlserverBlockTable6);


//        for(int i=0;i<lastList.size();i++){
//            boolean isexisit = false;
//            int exisitIndex = 0;
//            int exisitNewIndex = 0;
//            for (int j=0;j<list.size();j++){
//                if (lastList.get(i).getSid().equals(list.get(j).getSid())&&
//                        lastList.get(i).getLoginName().equals(list.get(j).getLoginName())&&
//                        lastList.get(i).getEventInfo().equals(list.get(j).getEventInfo())){
//                    isexisit = true;
//                    exisitIndex = i;
//                    exisitNewIndex = j;
//                }
//            }
//
//            if(isexisit){
//                //在新的组中记录次数（在原来的基础上相加）
//                list.get(exisitNewIndex).setConnectTime(1000L);
//                //将旧的移除
//                lastList.remove(exisitIndex);
//
//                //TODO 这种方案不行，移除掉下标移动，缺少了一些判断
//            }
//            if (!isexisit){
//                //已经不再出现的，超过时间则入库，没有超过时间则移除
//                lastList.remove(i);
//            }
//        }

        lastList.addAll(list);

        //合并 去重 次数+1
        for (int i=0;i<lastList.size()-1;i++){
            for (int j=lastList.size()-1;j>i;j--){
                if (lastList.get(j).getSid().equals(lastList.get(i).getSid())&&
                        lastList.get(j).getLoginName().equals(lastList.get(i).getLoginName())&&
                        lastList.get(j).getEventInfo().equals(lastList.get(i).getEventInfo())){
                    System.out.println("相等");
                    long time;
                    if (lastList.get(i).getConnectTime()==null){
                        time=0L;
                    }else {
                        time = lastList.get(i).getConnectTime() + 5L;
                    }
                    lastList.get(i).setConnectTime(time);
                    lastList.remove(j);
                }
            }
        }

        //移除已经不存在的
        for (int i=0;i<lastList.size();i++){
            boolean isexisit = false;
            for (int j=0;j<list.size();j++){
                if (lastList.get(i).getSid().equals(list.get(j).getSid())&&
                        lastList.get(j).getLoginName().equals(lastList.get(i).getLoginName())&&
                        lastList.get(j).getEventInfo().equals(lastList.get(i).getEventInfo())){
                    isexisit = true;
                }
            }
            if (!isexisit){
                //是否超过定义的时间
                lastList.remove(i);
            }
        }

        System.out.println("");
    }
}
