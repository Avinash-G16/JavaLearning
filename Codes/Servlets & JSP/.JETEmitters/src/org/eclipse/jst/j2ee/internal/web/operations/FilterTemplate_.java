package org.eclipse.jst.j2ee.internal.web.operations;

import java.util.*;
import org.eclipse.jst.j2ee.internal.common.operations.*;

public class FilterTemplate_
{
  protected static String nl;
  public static synchronized FilterTemplate_ create(String lineSeparator)
  {
    nl = lineSeparator;
    FilterTemplate_ result = new FilterTemplate_();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";";
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL + "import ";
  protected final String TEXT_5 = "/**" + NL + " * Servlet Filter implementation class ";
  protected final String TEXT_6 = NL + " *" + NL + " * @web.filter" + NL + " *   name=\"";
  protected final String TEXT_7 = "\"" + NL + " *   display-name=\"";
  protected final String TEXT_8 = "\"";
  protected final String TEXT_9 = NL + " *   description=\"";
  protected final String TEXT_10 = NL + " *" + NL + " * @web.filter-mapping";
  protected final String TEXT_11 = NL + " *   url-pattern=\"";
  protected final String TEXT_12 = NL + " *   servlet-name=\"";
  protected final String TEXT_13 = NL + " *   dispatcher=\"";
  protected final String TEXT_14 = NL + " *" + NL + " * @web.filter-init-param" + NL + " *    name=\"";
  protected final String TEXT_15 = "\"" + NL + " *    value=\"";
  protected final String TEXT_16 = NL + " *    description=\"";
  protected final String TEXT_17 = NL + " */";
  protected final String TEXT_18 = NL + "@WebFilter";
  protected final String TEXT_19 = "(\"";
  protected final String TEXT_20 = "\")";
  protected final String TEXT_21 = "({ ";
  protected final String TEXT_22 = ", ";
  protected final String TEXT_23 = " })";
  protected final String TEXT_24 = "(";
  protected final String TEXT_25 = NL + "\t\t";
  protected final String TEXT_26 = " = \"";
  protected final String TEXT_27 = " = { ";
  protected final String TEXT_28 = NL + "\t\t\t\t";
  protected final String TEXT_29 = " ";
  protected final String TEXT_30 = "}";
  protected final String TEXT_31 = NL + "\t\t\t\t@WebInitParam(name = \"";
  protected final String TEXT_32 = "\", value = \"";
  protected final String TEXT_33 = ", description = \"";
  protected final String TEXT_34 = ")";
  protected final String TEXT_35 = NL + "\t\t}";
  protected final String TEXT_36 = " = {";
  protected final String TEXT_37 = "}" + NL + "\t\t\t\t\t";
  protected final String TEXT_38 = " = ";
  protected final String TEXT_39 = NL + "public ";
  protected final String TEXT_40 = "abstract ";
  protected final String TEXT_41 = "final ";
  protected final String TEXT_42 = "class ";
  protected final String TEXT_43 = " extends ";
  protected final String TEXT_44 = " implements ";
  protected final String TEXT_45 = " {";
  protected final String TEXT_46 = NL + NL + "    /**" + NL + "     * Default constructor. " + NL + "     */" + NL + "    public ";
  protected final String TEXT_47 = "() {" + NL + "        // TODO Auto-generated constructor stub" + NL + "    }";
  protected final String TEXT_48 = NL + "       " + NL + "    /**" + NL + "     * @see ";
  protected final String TEXT_49 = "#";
  protected final String TEXT_50 = ")" + NL + "     */" + NL + "    public ";
  protected final String TEXT_51 = ") {" + NL + "        super(";
  protected final String TEXT_52 = ");" + NL + "        // TODO Auto-generated constructor stub" + NL + "    }";
  protected final String TEXT_53 = NL + NL + "\t/**" + NL + "     * @see ";
  protected final String TEXT_54 = ") ";
  protected final String TEXT_55 = "throws ";
  protected final String TEXT_56 = " { ";
  protected final String TEXT_57 = NL + "         // TODO Auto-generated method stub";
  protected final String TEXT_58 = NL + "\t\t\treturn ";
  protected final String TEXT_59 = NL + "    }";
  protected final String TEXT_60 = NL + NL + "\t/**" + NL + "\t * @see Filter#destroy()" + NL + "\t */" + NL + "\tpublic void destroy() {" + NL + "\t\t// TODO Auto-generated method stub" + NL + "\t}";
  protected final String TEXT_61 = NL + NL + "\t/**" + NL + "\t * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)" + NL + "\t */" + NL + "\tpublic void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {" + NL + "\t\t// TODO Auto-generated method stub" + NL + "\t\t// place your code here" + NL + "" + NL + "\t\t// pass the request along the filter chain" + NL + "\t\tchain.doFilter(request, response);" + NL + "\t}";
  protected final String TEXT_62 = NL + NL + "\t/**" + NL + "\t * @see Filter#init(FilterConfig)" + NL + "\t */" + NL + "\tpublic void init(FilterConfig fConfig) throws ServletException {" + NL + "\t\t// TODO Auto-generated method stub" + NL + "\t}";
  protected final String TEXT_63 = NL + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     CreateFilterTemplateModel model = (CreateFilterTemplateModel) argument; 
    
	model.removeFlags(CreateJavaEEArtifactTemplateModel.FLAG_QUALIFIED_SUPERCLASS_NAME); 

    
	if (model.getJavaPackageName() != null && model.getJavaPackageName().length() > 0) {

    stringBuffer.append(TEXT_1);
    stringBuffer.append( model.getJavaPackageName() );
    stringBuffer.append(TEXT_2);
    
	}

    stringBuffer.append(TEXT_3);
     
	Collection<String> imports = model.getImports();
	for (String anImport : imports) { 

    stringBuffer.append(TEXT_4);
    stringBuffer.append( anImport );
    stringBuffer.append(TEXT_2);
     
	}

    stringBuffer.append(TEXT_3);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(TEXT_5);
    stringBuffer.append( model.getClassName() );
     
	if (model.isAnnotated()) { 

    stringBuffer.append(TEXT_6);
    stringBuffer.append( model.getFilterName() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( model.getFilterName() );
    stringBuffer.append(TEXT_8);
    
		if (model.getDescription() != null && model.getDescription().length() > 0) { 

    stringBuffer.append(TEXT_9);
    stringBuffer.append( model.getDescription() );
    stringBuffer.append(TEXT_8);
     
		} 
		
		List<IFilterMappingItem> mappings = model.getFilterMappings();
 		for (IFilterMappingItem mapping : mappings) { 

    stringBuffer.append(TEXT_10);
    
			if (mapping.isUrlPatternType()) { 

    stringBuffer.append(TEXT_11);
    stringBuffer.append( mapping.getName() );
    stringBuffer.append(TEXT_8);
    
			} else if (mapping.isServletNameType()) { 

    stringBuffer.append(TEXT_12);
    stringBuffer.append( mapping.getName() );
    stringBuffer.append(TEXT_8);
    
			}
		 
			String dispatcher = model.getDispatcherList(mapping);
			if (dispatcher.length() > 0) { 

    stringBuffer.append(TEXT_13);
    stringBuffer.append( dispatcher );
    stringBuffer.append(TEXT_8);
     
			} 
		} 

		List<String[]> initParams = model.getInitParams();
		if (initParams != null && initParams.size() > 0) {
			for (int i = 0; i < initParams.size(); i++) {
				String name = model.getInitParam(i, CreateFilterTemplateModel.NAME);
				String value = model.getInitParam(i, CreateFilterTemplateModel.VALUE);
				String description = model.getInitParam(i, CreateFilterTemplateModel.DESCRIPTION); 

    stringBuffer.append(TEXT_14);
    stringBuffer.append( name );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( value );
    stringBuffer.append(TEXT_8);
    
				if (description != null && description.length() > 0) { 

    stringBuffer.append(TEXT_16);
    stringBuffer.append( description );
    stringBuffer.append(TEXT_8);
    
				}
			} 
		} 
	}

    stringBuffer.append(TEXT_17);
     
	if ("3.0".equals(model.getJavaEEVersion()) || "3.1".equals(model.getJavaEEVersion()) || "4.0".equals(model.getJavaEEVersion())) { 

    stringBuffer.append(TEXT_18);
    
		Map<String, Object> params = model.getClassAnnotationParams();
		if (params.size() == 1 && params.containsKey(CreateServletTemplateModel.ATT_URL_PATTERNS)) {
			List<String> mappings = (List<String>) params.get(CreateServletTemplateModel.ATT_URL_PATTERNS);
			if (mappings.size() == 1) {
				String value = mappings.get(0);

    stringBuffer.append(TEXT_19);
    stringBuffer.append( value );
    stringBuffer.append(TEXT_20);
    
			} else {

    stringBuffer.append(TEXT_21);
    
				boolean needComma = false;
				for (String mapping : mappings) {
					if (needComma) {

    stringBuffer.append(TEXT_22);
    
					}

    stringBuffer.append(TEXT_8);
    stringBuffer.append( mapping );
    stringBuffer.append(TEXT_8);
    
					needComma = true;
				}

    stringBuffer.append(TEXT_23);
    
			}
		} else if (!params.isEmpty()) { 

    stringBuffer.append(TEXT_24);
    
			Set<String> keys = params.keySet();
			boolean needNewLine = keys.contains(CreateFilterTemplateModel.ATT_INIT_PARAMS) || 
					(keys.contains(CreateFilterTemplateModel.ATT_URL_PATTERNS) && 
							((List<String>) params.get(CreateFilterTemplateModel.ATT_URL_PATTERNS)).size() > 1) || 
					(keys.contains(CreateFilterTemplateModel.ATT_SERVLET_NAMES) && 
							((List<String>) params.get(CreateFilterTemplateModel.ATT_SERVLET_NAMES)).size() > 1);
			boolean needComma = false;
			for (String key : keys) {
				if (needComma) {

    stringBuffer.append(TEXT_22);
    
				}
				
				if (needNewLine) {

    stringBuffer.append(TEXT_25);
    
				} 
			
				if (key.equals(CreateFilterTemplateModel.ATT_FILTER_NAME) || key.equals(CreateFilterTemplateModel.ATT_DESCRIPTION)) { 
					String value = (String) params.get(key);

    stringBuffer.append( key );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( value );
    stringBuffer.append(TEXT_8);
    
				} else if (key.equals(CreateFilterTemplateModel.ATT_URL_PATTERNS)) {

    stringBuffer.append( key );
    stringBuffer.append(TEXT_27);
    
					List<String> mappings = (List<String>) params.get(key);
					boolean needComma2 = false;
					boolean needNewLine2 = mappings.size() > 1;
					for (String mapping : mappings) {
						if (needComma2) {

    stringBuffer.append(TEXT_22);
    
						}
				
						if (needNewLine2) {

    stringBuffer.append(TEXT_28);
    
						} 

    stringBuffer.append(TEXT_8);
    stringBuffer.append( mapping );
    stringBuffer.append(TEXT_8);
    				
						needComma2 = true;
					}
				
					if (needNewLine2) {

    stringBuffer.append(TEXT_25);
    
					} else {

    stringBuffer.append(TEXT_29);
    
					}

    stringBuffer.append(TEXT_30);
    
				} else if (key.equals(CreateFilterTemplateModel.ATT_SERVLET_NAMES)) {

    stringBuffer.append( key );
    stringBuffer.append(TEXT_27);
    
					List<String> servletNames = (List<String>) params.get(key);
					boolean needComma2 = false;
					boolean needNewLine2 = servletNames.size() > 1;
					for (String servletName : servletNames) {
						if (needComma2) {

    stringBuffer.append(TEXT_22);
    
						}
				
						if (needNewLine2) {

    stringBuffer.append(TEXT_28);
    
						} 

    stringBuffer.append(TEXT_8);
    stringBuffer.append( servletName );
    stringBuffer.append(TEXT_8);
    				
						needComma2 = true;
					}
				
					if (needNewLine2) {

    stringBuffer.append(TEXT_25);
    
					} else {

    stringBuffer.append(TEXT_29);
    
					}

    stringBuffer.append(TEXT_30);
    
				} else if (key.equals(CreateFilterTemplateModel.ATT_INIT_PARAMS)) {

    stringBuffer.append( key );
    stringBuffer.append(TEXT_27);
    
					List<String[]> initParams = (List<String[]>) params.get(key);
					boolean needComma2 = false;
					for (String[] initParam : initParams) {
						if (needComma2) {

    stringBuffer.append(TEXT_22);
    
						}
						
						String name = initParam[CreateFilterTemplateModel.NAME];
						String value = initParam[CreateFilterTemplateModel.VALUE];
						String description = initParam[CreateFilterTemplateModel.DESCRIPTION];

    stringBuffer.append(TEXT_31);
    stringBuffer.append( name );
    stringBuffer.append(TEXT_32);
    stringBuffer.append( value );
    stringBuffer.append(TEXT_8);
    				
						if (description != null && description.length() > 0) {

    stringBuffer.append(TEXT_33);
    stringBuffer.append( description );
    stringBuffer.append(TEXT_8);
    
						}

    stringBuffer.append(TEXT_34);
    
						needComma2 = true;
					}

    stringBuffer.append(TEXT_35);
    
				} else if (key.equals(CreateFilterTemplateModel.ATT_DISPATCHER_TYPES)) {
				List<String> dispatcherTypes = (List<String>) params.get(key);
					boolean needComma2 = false;
					boolean needNewLine2 = dispatcherTypes.size() > 1;
					if (dispatcherTypes.size()>0){
					
    stringBuffer.append( key );
    stringBuffer.append(TEXT_36);
     
					}
					for (String dispType : dispatcherTypes) {
						if (needComma2) {

    stringBuffer.append(TEXT_22);
    
						}
				
						if (needNewLine2) {

    stringBuffer.append(TEXT_28);
    
						} 

    stringBuffer.append( dispType );
    				
						needComma2 = true;
					}
				
					if (needNewLine2) {

    stringBuffer.append(TEXT_25);
    
					} else {

    stringBuffer.append(TEXT_29);
    
					}
					
    stringBuffer.append(TEXT_37);
    
				}
				else if (key.equals(CreateFilterTemplateModel.ATT_ASYNC_SUPPORT)) {
					Boolean value =(Boolean) params.get(key);
				    if (value){

    stringBuffer.append( key );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( value );
    				    }				
				}				
				needComma = true;
  			}

    stringBuffer.append(TEXT_34);
    
		}
	}

    
	if (model.isPublic()) { 

    stringBuffer.append(TEXT_39);
     
	} 

	if (model.isAbstract()) { 

    stringBuffer.append(TEXT_40);
    
	}

	if (model.isFinal()) {

    stringBuffer.append(TEXT_41);
    
	}

    stringBuffer.append(TEXT_42);
    stringBuffer.append( model.getClassName() );
    
	String superClass = model.getSuperclassName();
 	if (superClass != null && superClass.length() > 0) {

    stringBuffer.append(TEXT_43);
    stringBuffer.append( superClass );
    
	}

	List<String> interfaces = model.getInterfaces(); 
 	if ( interfaces.size() > 0) { 

    stringBuffer.append(TEXT_44);
    
	}
	
 	for (int i = 0; i < interfaces.size(); i++) {
   		String INTERFACE = interfaces.get(i);
   		if (i > 0) {

    stringBuffer.append(TEXT_22);
    
		}

    stringBuffer.append( INTERFACE );
    
	}

    stringBuffer.append(TEXT_45);
     
	if (!model.hasEmptySuperclassConstructor()) { 

    stringBuffer.append(TEXT_46);
    stringBuffer.append( model.getClassName() );
    stringBuffer.append(TEXT_47);
     
	} 

	if (model.shouldGenSuperclassConstructors()) {
		List<Constructor> constructors = model.getConstructors();
		for (Constructor constructor : constructors) {
			if (constructor.isPublic() || constructor.isProtected()) { 

    stringBuffer.append(TEXT_48);
    stringBuffer.append( model.getSuperclassName() );
    stringBuffer.append(TEXT_49);
    stringBuffer.append( model.getSuperclassName() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( constructor.getParamsForJavadoc() );
    stringBuffer.append(TEXT_50);
    stringBuffer.append( model.getClassName() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( constructor.getParamsForDeclaration() );
    stringBuffer.append(TEXT_51);
    stringBuffer.append( constructor.getParamsForCall() );
    stringBuffer.append(TEXT_52);
    
			} 
		} 
	} 

    
	if (model.shouldImplementAbstractMethods()) {
		for (Method method : model.getUnimplementedMethods()) { 

    stringBuffer.append(TEXT_53);
    stringBuffer.append( method.getContainingJavaClass() );
    stringBuffer.append(TEXT_49);
    stringBuffer.append( method.getName() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( method.getParamsForJavadoc() );
    stringBuffer.append(TEXT_50);
    stringBuffer.append( method.getReturnType() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( method.getName() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( method.getParamsForDeclaration() );
    stringBuffer.append(TEXT_54);
      if (method.getExceptions().length() > 0){ 
    stringBuffer.append(TEXT_55);
    stringBuffer.append(method.getExceptions());
    stringBuffer.append(TEXT_56);
    }else {
    stringBuffer.append(TEXT_56);
     } 
    stringBuffer.append(TEXT_57);
     
			String defaultReturnValue = method.getDefaultReturnValue();
			if (defaultReturnValue != null) { 

    stringBuffer.append(TEXT_58);
    stringBuffer.append( defaultReturnValue );
    stringBuffer.append(TEXT_2);
    
			} 

    stringBuffer.append(TEXT_59);
     
		}
	} 

     if (model.shouldGenDestroy()) { 
    stringBuffer.append(TEXT_60);
     } 
     if (model.shouldGenDoFilter()) { 
    stringBuffer.append(TEXT_61);
     } 
     if (model.shouldGenInit()) { 
    stringBuffer.append(TEXT_62);
     } 
    stringBuffer.append(TEXT_63);
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
