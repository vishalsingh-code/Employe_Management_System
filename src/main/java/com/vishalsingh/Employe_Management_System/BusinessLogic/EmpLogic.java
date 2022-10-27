package com.vishalsingh.Employe_Management_System.BusinessLogic;

import com.vishalsingh.Employe_Management_System.EmpRepo.EmpRepo;
import com.vishalsingh.Employe_Management_System.Model.EmpModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;



@Component
public class EmpLogic {
    @Autowired
private EmpRepo empRepo;
//    EmpModel empModel1 =new EmpModel(10,"Vishal","singh","vishalsingh961266@gmail.com","Banglore","India","kengeri","IT","20000");
//    List <EmpModel> list=new ArrayList<>();


//  public boolean CreateEmp(){
//      boolean f=false;
//
//      f=true;
//      return f;
//
//  }


  public List<EmpModel> displayEmp(){
      List<EmpModel> list= (List<EmpModel>) this.empRepo.findAll();
      return list ;
  }


    public  EmpModel getEmpById(int id){
//      EmpModel model=null;
//      try {
//          model=list.stream().filter(e ->e.getEmployeId()==id).findFirst().get();
//
//      }catch (Exception e){
//          e.printStackTrace();
//      }
////
//        return model;
        return this.empRepo.findById(id);
    }

    public EmpModel CreateNewEmp(EmpModel emp) {
//      try {
//          list.add(emp);
//
//      }catch (Exception e){
//          e.printStackTrace();
//      }
//
//      return emp;
        return this.empRepo.save(emp);
    }

    public EmpModel updatings(EmpModel emp, int id)  {
//      try {
//          list= list.stream().map(update ->{
//
//              if (update.getEmployeId()==id){
//                  update.setFirsNname(emp.getFirsNname());
//                  update.setLastName(emp.getLastName());
//              }
//              return update;
//
//          }).collect(Collectors.toList());
//      }catch (Exception e){
//          e.printStackTrace();
//      }

        Optional<EmpModel> optional = Optional.ofNullable(empRepo.findById(id));
         EmpModel obj=optional.get();
         obj.setEmployeId(emp.getEmployeId());

        return this.empRepo.save(emp);



    }

    public boolean DeleteById(int id) {
      boolean f=false;
//      try {
//          list=list.stream().filter(empModel -> empModel.getEmployeId()!=id).findFirst().stream().collect(Collectors.toList());
//      }catch (Exception e){
//          e.printStackTrace();
//      }
        this.empRepo.deleteById(id);;
        f=true;
        return f;
    }
}


