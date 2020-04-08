package Application.classes;

import java.util.List;

public abstract class People <PersonType extends Person> implements Iterable<PersonType>{
    List<PersonType>personList;
    public People(List<PersonType>personList) {
        this.personList=personList;
    }

    void add(PersonType personType){
        personList.add(personType);
    }
    void remove(PersonType personType){
        personList.remove(personType);
    }
    int size(PersonType personType){
       return personList.size();
    }
    void clears(PersonType personType){
        personList.clear();
    }
    void addALL(Iterable<PersonType> personTypes) {
        for (PersonType p : personTypes) {
            personList.add(p);
        }
    }

    public PersonType findById(Long id){
            for (PersonType p : personList) {
                if (p.getId() == id) {
                    return p;
                }
            } return null;
    }
public List<PersonType> findAll(){
        return personList;
}


}
