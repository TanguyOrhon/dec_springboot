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

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(path = "/{id}", produces = APPLICATION_JSON_VALUE)
    public GameCharacter getGameCharacter(@PathVariable int id) {
        return this.gameCharacterService.getGameCharacter(id);
    }

    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "/{id}")
    public void deleteGameCharacter(@PathVariable int id) {
        this.gameCharacterService.deleteGameCharacter(id);
    }
}
