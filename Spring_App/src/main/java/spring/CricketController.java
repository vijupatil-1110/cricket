package spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class CricketController {

	private CricketRespository CricketRespository;

    @Autowired
    public CricketController(CricketRespository CricketRespository) {
        this.CricketRespository = CricketRespository;
    }
    
    @GetMapping("/cricketer/all")
    Iterable<CricketEntity> all() {
        return CricketRespository.findAll();
    }
    
    @PostMapping("/cricketer/save")
    CricketEntity save(@RequestBody CricketEntity cricketer) {
        return CricketRespository.save(cricketer);
    }
    
    @GetMapping("/crickter/{id}")
    Optional<CricketEntity> cricketerById(@PathVariable Long id) {
        return CricketRespository.findById(id) ;       		
    }
}
