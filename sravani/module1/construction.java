package day1;
interface structure
{
    public void construction();
    public void interior();
}
abstract class building  {
    public void floors();
    public void furniture();
    public void paint();
    public void rooms();
}
class officebuilding extends building implements structure
{
  public void construction()
  {
    System.out.println("this construction includes ancient style ");
  }
  public void interior()
  {
    System.out.println("since it for office it will have technology realated interior");
  }
  public void floors()
  {
    System.out.println("office building have 4 floors");
  }
  public void furniture()
  {
    System.out.println("furniture consists of sofa,cabins");
  }
}

