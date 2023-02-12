package edu.deMetodoaVista.web.controlador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.deMetodoaVista.aplicaciones.pojos.Usuarios;

//Controlador de la vista
@Controller
public class Controlador {
	
	protected final Log logger = LogFactory.getLog(getClass());

	//Lista de Usuarios
	List<Usuarios> listaUsuarios = new ArrayList<Usuarios>();
	
	//Creacion de modelo
	Map<String, Object> miModelo = new HashMap<String, Object>();  
	
	//Metodo post para presentar una lista de usuarios y añadir uno mas 
	@RequestMapping(value="/pruebaPost", method = RequestMethod.POST)
	public ModelAndView pruebaPOST(@ModelAttribute("UsuarioNuevo") Usuarios nuevoUsuario) {
		  
		listaUsuarios.add(new Usuarios("Juan", "Canto"));
		listaUsuarios.add(new Usuarios("Charles", "Darwin"));
		listaUsuarios.add(nuevoUsuario);  
		miModelo.put("listaUsuarios", listaUsuarios);

			
		return new ModelAndView("resultado", "miModelo", miModelo);
	}
	 
	//Controlador de navegacion al formulario en el que introducimos un modelo con un nuevo usuario vacio
	 @RequestMapping(value="/navegacionFormulario")
	 public String navegacionFormulario(Model modelo) {
	        logger.info("Navegamos al formulario");
	        Usuarios nuevoUsuario = new Usuarios();
 	        modelo.addAttribute("UsuarioNuevo", nuevoUsuario);
	        return "formulario";
	    } 
	 
	 	//Metodo get que recoge los datos de un formulario y los presenta juanto a un mensaje
	    @RequestMapping(value="/pruebaGet",method = RequestMethod.GET)
	    public ModelAndView pruebaGet(@ModelAttribute("UsuarioNuevo") Usuarios usuarioNuevo){
	    	listaUsuarios.add(usuarioNuevo);  
	        miModelo.put("mensaje","Metodo Get");
	        miModelo.put("listaAlumnos", listaUsuarios);
	    	return new ModelAndView("resultado", "miModelo", miModelo);
	    }
	
}
