public class Users {
     class users {
        String Account;
        String password;
        String Name;
        Character Sex;
        String Contact;
        String units;

        void login(){}
        void cancellation(){}
    }
    class writer extends users {
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
        void Billquery(){}//提案查询
        void Proposalpreparation(){}//提案编制
        void Standardquery(){}
        void Proposalquery(){}
        void Informationmaintenance(){}








    }








}
