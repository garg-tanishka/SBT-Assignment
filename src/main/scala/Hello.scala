import util._

object Hello {
  def main(args: Array[String]) = {
  	HelloFromActor.hello()
	HelloFromPersistence.hello()
   	println("Welcome to SBT")
  }
}
