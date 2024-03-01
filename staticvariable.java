class staticvariable {
    static int count = 0;
    staticvariable(){
        count++;
        System.out.println(count);
    }
    public static void main(String args[]){
        staticvariable ob1 = new staticvariable();
        staticvariable ob2 = new staticvariable();
    }
}
