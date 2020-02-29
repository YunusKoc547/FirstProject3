package replpractice;

public class MethodsWithString10LameDB_187 {

    public static String lameDb(String db, String op,String id,String data)
    {
        if(op.equals("add")){
            return  db+="#"+id+data;
        } else {
            int endIndex = db.indexOf("#", db.indexOf(id));
            if(db.charAt(db.lastIndexOf("#")+1)==id.charAt(0)){
                endIndex=db.length();
            }
            String substring = db.substring(db.indexOf(id), endIndex);
            if(op.equals("edit")){
                return db.replace(substring,id+data);
            } else if(op.equals("delete")){
                if(!id.equals(db.substring(0,1)))substring=db.substring(db.indexOf(id)-1, endIndex);
                return db.replace(substring,"");
            }
        }
        return db;


    }//end lameDb


    public static void main(String[] args)
    {


        System.out.print(
                lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
        );

        System.out.print(
                lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n"
        );

        System.out.print(
                lameDb("1tst#2bla#3foo","delete","1","")+"\n"
        );

        System.out.print(
                lameDb("1tst#2bla#3foo","none","1","")+"\n"
        );

    }
}
