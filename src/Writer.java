class Writer extends Users {
    private String Date;
    private String Adress;
    private  String Referees;
    private  String Num;
    private  String Title;
    private  String Position;
    private  String Email;
    private  String Wechat;

    String getDate(){ return Date;}
    String getAdress(){return Adress;}
    String getReferees(){return Referees;}
    String getNum(){return Num;}
    String getTitle(){return Title;}
    String getPosition(){return Position;}
    String getEmail(){return Email;}
    String getWechat(){return Wechat;}
    void setDate(String rep){Date=rep;}
    void setAdress(String rep){Adress=rep;}
    void setReferees(String rep){ Referees=rep;}
    void setNum(String rep){ Num=rep;}
    void setTitle(String rep){ Title=rep;}
    void setPosition(String rep){ Position=rep;}
    void setEmail(String rep){ Email=rep;}
    void setWechat(String rep){ Wechat=rep;}

    String tostring (){return super.tostring()+"\\"+Date+"\\"+Adress+"\\"+Referees+"\\"+Num
            +"\\"+Title+"\\"+Position+"\\"+Email +"\\"+Wechat+"/n";}
    String tostring (String ss){return ss+"\\"+super.tostring()+"\\"+Date+"\\"+Adress+"\\"+Referees+"\\"+Num
            +"\\"+Title+"\\"+Position+"\\"+Email +"\\"+Wechat+"/n";}
    void Billquery(){}//提案查询
    void Proposalpreparation(){}//提案编制
    void Standardquery(){}
    void Proposalquery(){}
    void Informationmaintenance(){}

}