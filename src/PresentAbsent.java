public class PresentAbsent implements IPresentOrAbsent {
    @Override
    public int presentOrAbsent() {
        int checkPresent = (int)Math.floor(Math.random()*10)%2;
        return checkPresent;
    }


}
