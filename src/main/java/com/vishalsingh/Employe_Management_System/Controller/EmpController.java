package com.vishalsingh.Employe_Management_System.Controller;

import com.vishalsingh.Employe_Management_System.BusinessLogic.EmpLogic;
import com.vishalsingh.Employe_Management_System.Model.EmpModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmpController {
    @Autowired
    EmpLogic empLogic;





//    @GetMapping("/test1")
//    public ResponseEntity<Void> CreateList() {
//        boolean result = empLogic.CreateEmp();
//        if (result) {
//            System.out.println("Inserted");
//        } else {
//            System.out.println("Not inserted");
//        }
//        return ResponseEntity.status(HttpStatus.OK).build();
//    }




    @GetMapping("/test2")
    public ResponseEntity<List<EmpModel>>  getAllEmp(){
        List<EmpModel> list = empLogic.displayEmp();
        if (list.size()<=0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list));
    }




     @GetMapping("/test3/{id}")
     public ResponseEntity <EmpModel> getEmpById(@PathVariable("id") int id){
             EmpModel update=null;
             update=this.empLogic.getEmpById(id);
             if (update==null){
                 return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

             }
             return ResponseEntity.of(Optional.of(update));

    }



   @PostMapping("/test4")
    public ResponseEntity<EmpModel>  Posts(@RequestBody  EmpModel emp){
        EmpModel post=null;
        post=this.empLogic.CreateNewEmp(emp);
        if (post==null){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        return ResponseEntity.of(Optional.of(post));
    }



    @PutMapping("/test5/{id}")
    public ResponseEntity<EmpModel> updating(@PathVariable("id") int id, @RequestBody EmpModel emp ){
        EmpModel Updates=null;
        Updates = this.empLogic.updatings(emp,id);
        if (Updates==null){

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        return ResponseEntity.of(Optional.of(Updates));




    }



    @DeleteMapping("test6/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id){
       boolean f= this.empLogic.DeleteById(id);
        if (f==true){
            return ResponseEntity.status(HttpStatus.OK).build();
        }
        else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }



}
