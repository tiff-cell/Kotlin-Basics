class Employee(var name: String, var postion: String,var salary: Double,var status:String){

    fun work(){
        println("Employee is Working")
    }



}

fun main(){
    var employee1= Employee("Martha","CEO",560000.00,"Married")
    println(employee1.name + " " + employee1.postion + " " + employee1.salary + " " + employee1.status)

    var employee2= Employee("Dennis","M.D",260000.00,"Single")
    println(employee2.name + " " + employee2.postion + " " + employee2.salary + " " + employee2.status)

    var employee3= Employee("Gabby","H.R",160000.00,"Married")
    println(employee3.name + " " + employee3.postion + " " + employee3.salary + " " + employee3.status)

}