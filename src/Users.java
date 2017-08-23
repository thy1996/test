import java.io.*;

public class Users implements Serializable{
    String Account;
    String password;
    String Name;
    String Sex;
    String Contact;
    String units;
    String getAccount(){return Account;}
    String getPassword(){return password;}
    String getName(){return Name;}
    String getSex(){return Sex;}
    String getContact(){return Contact;}
    String getunits(){return units;}
    void setAccount(String rep){Account=rep;}
    void setpassword(String rep){password=rep;}
    void setName(String rep){Name=rep;}
    void setSex(String rep){Sex=rep;}
    void setContact(String rep){Contact=rep;}
    void setUnits(String rep){units=rep;}

    String tostring (){return Account+"\\"+password+"\\"+Name+"\\"+Sex+"\\"+Contact+"\\"+units+"/n";}
    String tostring (String SS){return SS+"\\"+Account+"\\"+password+"\\"+Name
                +"\\"+Sex+"\\"+Contact+"\\"+units+"/n";}
    public static boolean Save(Object ob){
        try{
            FileOutputStream fs=new FileOutputStream("test.dat");
            ObjectOutputStream os=new ObjectOutputStream(fs);
            os.writeObject(ob);
            os.close();
        }catch (IOException ex){
            ex.printStackTrace();
            return false;
        }
        return true;
    }
    public static Object readObjectFromFile()
    {
        Object temp=null;
        File file =new File("test.dat");
        FileInputStream in;
        try {
            in = new FileInputStream(file);
            ObjectInputStream objIn=new ObjectInputStream(in);
            temp=objIn.readObject();
            objIn.close();
            System.out.println("read object success!");
        } catch (IOException e) {
            System.out.println("read object failed");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return temp;
    }
        void login(){}
        void cancellation(){}
}

