package decouv.spring.controller;

import decouv.spring.entity.GameCharacter;
import decouv.spring.service.GameCharacterService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "/character")
public class GameCharacterController {
    private final GameCharacterService gameCharacterService;
    public GameCharacterController(GameCharacterService gameCharacterService) {
        this.gameCharacterService = gameCharacterService;
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public void createGameCharacter(@RequestBody GameCharacter gamecharacter) {
        this.gameCharacterService.createGameCharacter(gamecharacter);
    }

    @GetMapping
    public void getGameCharacter() {

    }
}
