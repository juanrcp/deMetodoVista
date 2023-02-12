package edu.deMetodoaVista;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import edu.deMetodoaVista.aplicaciones.AplicacionConfiguracionContexto;
import edu.deMetodoaVista.web.WebConfiguracionContexto;

public class EnrutadordeClaseaVista extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { AplicacionConfiguracionContexto.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { WebConfiguracionContexto.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

}
