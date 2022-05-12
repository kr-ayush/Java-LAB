 abstract class demo
{
final float g=9.8f;
 abstract void cal();
}
class abc extends demo
{
int u;
float t;
double s;
abc()
{
u=1;
t=0.0f;
}

void cal()
{
	for(int i=0;i<4;i++)
	{
	System.out.println("Value S for u= "+u+" And t= "+t);
    s=((u*t)+(0.5*g*(t*t)));
    System.out.println(s);
    u=u+2;
    t=t+0.5f;
}

}
}

class MainClass
{
public  static void main(String []args)
{
abc obj=new abc();
obj.cal();

}
}
