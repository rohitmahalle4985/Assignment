package Assignment7Constructor;
//Main--MainMySingleton
public class MySingleton1 {
static MySingleton1 instance=null;
public int x=10;

static public MySingleton1 getInstance()
{
	if(instance==null)
		instance=new MySingleton1();
	return instance;
}
}


