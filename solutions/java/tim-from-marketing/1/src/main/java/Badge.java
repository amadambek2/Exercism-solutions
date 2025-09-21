class Badge {
    public String print(Integer id, String name, String department) {
        if(id==null){
            String s = String.valueOf(id);
            return name + " - " + (department==null ? "OWNER":department.toUpperCase());
        }
        if(department==null){
            return "[" + id + "] - " + name + " - " + "OWNER";
        }
        else
            return "[" + id + "] - " + name + " - " + department.toUpperCase();
    }
}
