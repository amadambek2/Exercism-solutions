
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay.clone();
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]++;
    }

    public boolean hasDayWithoutBirds() {
        
       for(int days : birdsPerDay){
            if(days==0){
                return true;
            } 
       }
       return false;  
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count=0;
        int limit = Math.min(numberOfDays, birdsPerDay.length);
        for(int i=0;i<limit;i++){
                count+=birdsPerDay[i];
            }
        return count;
    }

    public int getBusyDays() {
        int busy=0;
        for(int days : birdsPerDay){
            if(days>=5)
              busy++;  
        }
        return busy;
    }
}
