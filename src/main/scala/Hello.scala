import util._

/* Creation of object for the entry point in the scala program, 
we are calling methods from different objects defined in other modules also */
object Hello {
  def main(args: Array[String]) = {
  	HelloFromActor.hello()
	HelloFromPersistence.hello()
   	println("Welcome to SBT")
  }
}
