package base;

public class MyInteger {
	private int iValue;
	
	public MyInteger(int newValue)
	{
		iValue = newValue;
	}
	
	
	public int getiValue()
	{
		return iValue;
	}

	public static boolean isEven(int iValue)
	{
		if ((iValue % 2) == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isOdd(int iValue)
	if ((iValue % 2) == 1)
	{
		return true;
	}
	else
	{
		return false;
	}
	
	public static boolean isPrime(int iValue)
	{
      for (int divider = 2; divider <= iValue / 2; divider++) {
    	  if (iValue % divider == 0) 
    	  {
    		  return false; 
    	{
    	
    		  }
    	  }
    	  }
      }
	
	public boolean isEven()
	{
		return isEven(iValue);
		
	}
	public boolean isOdd();
	{
		return isOdd(iValue);
		
	}
	public boolean isPrime()
	{
		return isPrime(iValue);
		
	}
	public static boolean isEven(MyInteger iValue)
	{
		return iValue.isEven();
	}
	public static boolean isOdd(MyInteger iValue);
	{
		return iValue.isOdd();
	}
	public static boolean isPrime(MyInteger iValue)
	{
		return iValue.isPrime;
	}
	public boolean isEquals(int x)
	{
		return iValue == x;
	}
	public boolean isEquals(MyInteger x)
	{
		return x.MyInteger
	}
	
	
		
		}
	}



