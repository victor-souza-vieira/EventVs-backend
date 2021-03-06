package br.com.eventvs.api.resources;

import br.com.eventvs.api.dto.requests.CategoriaRequest;
import br.com.eventvs.core.security.EventvsSecurity;
import br.com.eventvs.domain.controller.GerenciarCategoriaController;
import br.com.eventvs.domain.model.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static br.com.eventvs.api.util.Paths.*;

@RestController
@RequestMapping(value = PATH_CATEGORIA)
@CrossOrigin(methods = {RequestMethod.DELETE, RequestMethod.GET, RequestMethod.HEAD, RequestMethod.OPTIONS, RequestMethod.PATCH, RequestMethod.POST, RequestMethod.PUT})
public class CategoriaResource {

    @Autowired
    private GerenciarCategoriaController gerenciarCategoriaController;

    @Autowired
    private EventvsSecurity eventvsSecurity;

    /**
     * Lista todas as categorias
     *
     * @return List<Categoria>
     * */
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Categoria> listarCategorias(){
        return gerenciarCategoriaController.listarCategorias();
    }


    /**
     * Busca categorias que contenham o nome
     *
     * @param categoria
     * @return List<Categoria>
     * */
    @GetMapping
    @RequestMapping(value = PATH_BUSCAR_CATEGORIA_POR_NOME)
    public ResponseEntity<?> buscarCategoriasPorNome(@RequestBody CategoriaRequest categoria){
        List<Categoria> categorias = gerenciarCategoriaController.listarCategoriasPorNome(categoria);
        return ResponseEntity.status(HttpStatus.OK).body(categorias);
    }

    /**
     * Cadastra categoria
     *
     * @param categoriaRequest
     * @return Categoria
     * */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria cadastrarCategoria(@RequestBody CategoriaRequest categoriaRequest){
        return gerenciarCategoriaController.cadastrarCategoria(categoriaRequest);
    }

    /**
     * Busca categorias que contenham aquela descricao
     *
     * @param categoria
     * @return List<Categoria>
     * */
    @GetMapping
    @RequestMapping(value = PATH_BUSCAR_CATEGORIA_POR_DESCRICAO)
    public ResponseEntity<?> buscarCategoriaPorDescricao(@RequestBody CategoriaRequest categoria) {
        List<Categoria> categorias = gerenciarCategoriaController.listarCategoriaPorDescricao(categoria);
        return ResponseEntity.status(HttpStatus.OK).body(categorias);
    }
}
