
let employee = (function () {
   var name;
   var age;
   var salary;
   function getAge() {

      return age;
   }
   function getSalary() {

      return salary;
   }
   function getName() {
      return name;
   }
   function setAge1(newAge) {
      age = newAge
   }
   function setName1(newName) { name = newName }
   function setsalary1(newSalary) { salary = newSalary }

   function inccreaseSalary1(percentage) { salary = getSalary() * (1 + percentage / 100) }
   function incrementAge1() { getAge + 1 }


   return {

      setAge: setAge1,
      setName: setName1,
      setSalary: setsalary1,
      increaseSalary: inccreaseSalary1,
      incrementAge: incrementAge1,
      getEmpInfo: function () {
         return `\nName: ${getName()}\nAge: ${getAge()}\nSalary: ${getSalary()}\n`;
      }
   };


}
)();

employee.address = "14t st NW";
employee.setAddress = function (newAddress) { this.address = newAddress };
employee.getAddress = function () { return this.address };
