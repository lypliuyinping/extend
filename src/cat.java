import demo.animal;

 public  class cat extends animal {
    public cat(String weight, String age, String run, String eat) {
        super(weight, age, run, eat);
    }
     public  cat() {
         super();
     };

     public String call;
     public String getCall() {
        System.out.println("22");
          return call;
     }
}