package primalty;
/**
 * This class contains static methods that determine the primality of a number.
 * The methods have progressively more efficient algorithms for determining primality.
 * (Starting with an algorithm that checks every single number and ending with
 * a Sieve Of Eratosthenes) The Purpose of this class is to experiment with time 
 * savings of using a more efficient algorithm @author Anirudh Mylavarapu
 *
 */
public class Primalty 
{
	/**
	 * This method will check every single natural
	 * number less than the candidatePrime to check for divisibility.
	 * It as abhorrently inefficient
	 * @param candidatePrime
	 * The positive integer that needs to be tested for primality.
	 * @return
	 * This function returns true if the candidatePrime is indeed a prime
	 * and false if it is not.
	 */
	public static boolean everyNumber(int candidatePrime)
	{
		return true;
	}
	
	/**
	 * This method will check every odd natural
	 * number less than the candidatePrime to check for divisibility.
	 * It is half as inefficient as checking all the numbers, but it is
	 * still detestable.
	 * @param candidatePrime
	 * The positive integer that needs to be tested for primality.
	 * @return
	 * This function returns true if the candidatePrime is indeed a prime
	 * and false if it is not.
	 */
	public static boolean allOdd(int candidateePrime)
	{
		return true;
	}
	
	/**
	 * This method will check every odd natural
	 * number less than the candidatePrime to check for divisibility.
	 * It is half as inefficient as checking all the odd numbers, 
	 * but it still has room for improvement.
	 * @param candidatePrime
	 * The positive integer that needs to be tested for primality.
	 * @return
	 * This function returns true if the candidatePrime is indeed a prime
	 * and false if it is not.
	 */
	public static boolean halfOdd(int candidatePrime)
	{
		return true;
	}
	
	/**
	 * This method will check every odd natural
	 * number less than the square root of the candidatePrime to check for divisibility. 
	 * It's starting to get better but it still has room for improvement.
	 * @param candidatePrime
	 * The positive integer that needs to be tested for primality.
	 * @return
	 * This function returns true if the candidatePrime is indeed a prime
	 * and false if it is not.
	 */
	public static boolean upToSQRt(int candidatePrime)
	{
		return true;
	}
	
}
