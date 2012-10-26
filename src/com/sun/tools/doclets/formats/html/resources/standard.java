 package com.sun.tools.doclets.formats.html.resources;
 
 import java.util.ListResourceBundle;
 
 public final class standard extends ListResourceBundle
 {
   protected final Object[][] getContents()
   {
     return new Object[][] {
                { "doclet.0_Fields_and_Methods", "&quot;{0}&quot; Fields and Methods" },
 				{ "doclet.All_Packages", "Todos os pacotes" },
 				{ "doclet.Annotation_Type_Hierarchy", "Annotation Type Hierarchy" },
 				{ "doclet.Blank", "Em Branco" },
 				{ "doclet.CLASSES", "CLASSES" },
 				{ "doclet.Cannot_handle_no_packages", "Cannot handle no packages." },
 				{ "doclet.ClassUse_Annotation", "Classes in {1} with annotations of type {0}" },
 				{ "doclet.ClassUse_Classes.in.0.used.by.1", "Classes in {0} used by {1}" },
 				{ "doclet.ClassUse_ConstructorAnnotations", "Constructors in {1} with annotations of type {0}" },
 				{ "doclet.ClassUse_ConstructorArgs", "Constructors in {1} with parameters of type {0}" },
 				{ "doclet.ClassUse_ConstructorArgsTypeParameters", "Constructor parameters in {1} with type arguments of type {0}" },
 				{ "doclet.ClassUse_ConstructorParameterAnnotations", "Constructor parameters in {1} with annotations of type {0}" },
 				{ "doclet.ClassUse_ConstructorThrows", "Constructors in {1} that throw {0}" },
 				{ "doclet.ClassUse_Field", "Fields in {1} declared as {0}" },
 				{ "doclet.ClassUse_FieldAnnotations", "Fields in {1} with annotations of type {0}" },
 				{ "doclet.ClassUse_FieldTypeParameter", "Fields in {1} with type parameters of type {0}" },
 				{ "doclet.ClassUse_ImplementingClass", "Classes in {1} that implement {0}" },
 				{ "doclet.ClassUse_MethodAnnotations", "Methods in {1} with annotations of type {0}" },
 				{ "doclet.ClassUse_MethodArgs", "Methods in {1} with parameters of type {0}" },
 				{ "doclet.ClassUse_MethodArgsTypeParameters", "Method parameters in {1} with type arguments of type {0}" },
 				{ "doclet.ClassUse_MethodParameterAnnotations", "Method parameters in {1} with annotations of type {0}" },
 				{ "doclet.ClassUse_MethodReturn", "Methods in {1} that return {0}" },
 				{ "doclet.ClassUse_MethodReturnTypeParameter", "Methods in {1} that return types with arguments of type {0}" },
 				{ "doclet.ClassUse_MethodThrows", "Methods in {1} that throw {0}" },
 				{ "doclet.ClassUse_MethodTypeParameter", "Methods in {1} with type parameters of type {0}" },
 				{ "doclet.ClassUse_No.usage.of.0", "No usage of {0}" },
 				{ "doclet.ClassUse_PackageAnnotation", "Packages with annotations of type {0}" },
 				{ "doclet.ClassUse_Packages.that.use.0", "Packages that use {0}" },
 				{ "doclet.ClassUse_Subclass", "Subclasses of {0} in {1}" },
 				{ "doclet.ClassUse_Subinterface", "Subinterfaces of {0} in {1}" },
 				{ "doclet.ClassUse_Title", "Uses of {0}<br>{1}" },
 				{ "doclet.ClassUse_TypeParameter", "Classes in {1} with type parameters of type {0}" },
 				{ "doclet.ClassUse_Uses.of.0.in.1", "Uses of {0} in {1}" },
 				{ "doclet.Class_Hierarchy", "Hierarquia de classes" },
 				{ "doclet.Constructor_for", "Constructor for {0}" },
 				{ "doclet.Contents", "Contents" },
 				{ "doclet.Deprecated_API", "Deprecated API" },
 				{ "doclet.Deprecated_Annotation_Type_Members", "Deprecated Annotation Type Elements" },
 				{ "doclet.Deprecated_Annotation_Types", "Deprecated Annotation Types" },
 				{ "doclet.Deprecated_Classes", "Deprecated Classes" },
 				{ "doclet.Deprecated_Constructors", "Deprecated Constructors" },
 				{ "doclet.Deprecated_Enum_Constants", "Deprecated Enum Constants" },
 				{ "doclet.Deprecated_Enums", "Deprecated Enums" },
 				{ "doclet.Deprecated_Errors", "Deprecated Errors" },
 				{ "doclet.Deprecated_Exceptions", "Deprecated Exceptions" },
 				{ "doclet.Deprecated_Fields", "Deprecated Fields" },
 				{ "doclet.Deprecated_Interfaces", "Deprecated Interfaces" },
 				{ "doclet.Deprecated_List", "Deprecated List" },
 				{ "doclet.Deprecated_Methods", "Deprecated Methods" },
 				{ "doclet.Description", "Description" },
 				{ "doclet.Description_From_Class", "Description copied from class: {0}" },
 				{ "doclet.Description_From_Interface", "Description copied from interface: {0}" },
 				{ "doclet.Detail", "DETAIL:" },
 				{ "doclet.Docs_generated_by_Javadoc", "Documentation generated by Javadoc." },
 				{ "doclet.Enclosing_Class", "Enclosing class:" },
 				{ "doclet.Enclosing_Interface", "Enclosing interface:" },
 				{ "doclet.Enum_Hierarchy", "Enum Hierarchy" },
 				{ "doclet.Error_in_packagelist", "Error in using -group option: {0} {1}" },
 				{ "doclet.FRAMES", "FRAMES" },
 				{ "doclet.Factory_Method_Detail", "Static Factory Method Detail" },
 				{ "doclet.File_error", "Error reading file: {0}" },
 				{ "doclet.Following_From_Class", "Following copied from class: {0}" },
 				{ "doclet.Following_From_Interface", "Following copied from interface: {0}" },
 				{ "doclet.Frame_Alert", "Frame Alert" },
 				{ "doclet.Frame_Output", "Frame Output" },
 				{ "doclet.Frame_Version", "Frame version" },
 				{ "doclet.Frame_Warning_Message", "This document is designed to be viewed using the frames feature. If you see this message, you are using a non-frame-capable web client." },
 				{ "doclet.Frames", "Frames" },
 				{ "doclet.Generated_Docs_Untitled", "Generated Documentation (Untitled)" },
 				{ "doclet.Groupname_already_used", "In -group option, groupname already used: {0}" },
 				{ "doclet.Help", "Help" },
 				{ "doclet.Help_annotation_type_line_1", "Each annotation type has its own separate page with the following sections:" },
 				{ "doclet.Help_annotation_type_line_2", "Annotation Type declaration" },
 				{ "doclet.Help_annotation_type_line_3", "Annotation Type description" },
 				{ "doclet.Help_enum_line_1", "Each enum has its own separate page with the following sections:" },
 				{ "doclet.Help_enum_line_2", "Enum declaration" },
 				{ "doclet.Help_enum_line_3", "Enum description" },
 				{ "doclet.Help_line_1", "How This API Document Is Organized" },
 				{ "doclet.Help_line_10", "All Known Implementing Classes" },
 				{ "doclet.Help_line_11", "Class/interface declaration" },
 				{ "doclet.Help_line_12", "Class/interface description" },
 				{ "doclet.Help_line_13", "Each summary entry contains the first sentence from the detailed description for that item. The summary entries are alphabetical, while the detailed descriptions are in the order they appear in the source code. This preserves the logical groupings established by the programmer." },
 				{ "doclet.Help_line_14", "Use" },
 				{ "doclet.Help_line_15", "Each documented package, class and interface has its own Use page.  This page describes what packages, classes, methods, constructors and fields use any part of the given class or package. Given a class or interface A, its Use page includes subclasses of A, fields declared as A, methods that return A, and methods and constructors with parameters of type A.  You can access this page by first going to the package, class or interface, then clicking on the \"Use\" link in the navigation bar." },
 				{ "doclet.Help_line_16", "Tree (Class Hierarchy)" },
 				{ "doclet.Help_line_17_with_tree_link", "There is a {0} page for all packages, plus a hierarchy for each package. Each hierarchy page contains a list of classes and a list of interfaces. The classes are organized by inheritance structure starting with <code>java.lang.Object</code>. The interfaces do not inherit from <code>java.lang.Object</code>." },
 				{ "doclet.Help_line_18", "When viewing the Overview page, clicking on \"Tree\" displays the hierarchy for all packages." },
 				{ "doclet.Help_line_19", "When viewing a particular package, class or interface page, clicking \"Tree\" displays the hierarchy for only that package." },
 				{ "doclet.Help_line_2", "This API (Application Programming Interface) document has pages corresponding to the items in the navigation bar, described as follows." },
 				{ "doclet.Help_line_20_with_deprecated_api_link", "The {0} page lists all of the API that have been deprecated. A deprecated API is not recommended for use, generally due to improvements, and a replacement API is usually given. Deprecated APIs may be removed in future implementations." },
 				{ "doclet.Help_line_21", "Index" },
 				{ "doclet.Help_line_22", "The {0} contains an alphabetic list of all classes, interfaces, constructors, methods, and fields." },
 				{ "doclet.Help_line_23", "Prev/Next" },
 				{ "doclet.Help_line_24", "These links take you to the next or previous class, interface, package, or related page." },
 				{ "doclet.Help_line_25", "Frames/No Frames" },
 				{ "doclet.Help_line_26", "These links show and hide the HTML frames.  All pages are available with or without frames." },
 				{ "doclet.Help_line_27", "Each serializable or externalizable class has a description of its serialization fields and methods. This information is of interest to re-implementors, not to developers using the API. While there is no link in the navigation bar, you can get to this information by going to any serialized class and clicking \"Serialized Form\" in the \"See also\" section of the class description." },
 				{ "doclet.Help_line_28", "The <a href=\"constant-values.html\">Constant Field Values</a> page lists the static final fields and their values." },
 				{ "doclet.Help_line_29", "This help file applies to API documentation generated using the standard doclet." },
 				{ "doclet.Help_line_3", "The {0} page is the front page of this API document and provides a list of all packages with a summary for each.  This page can also contain an overall description of the set of packages." },
 				{ "doclet.Help_line_4", "Each package has a page that contains a list of its classes and interfaces, with a summary for each. This page can contain four categories:" },
 				{ "doclet.Help_line_5", "Class/Interface" },
 				{ "doclet.Help_line_6", "Each class, interface, nested class and nested interface has its own separate page. Each of these pages has three sections consisting of a class/interface description, summary tables, and detailed member descriptions:" },
 				{ "doclet.Help_line_7", "Class inheritance diagram" },
 				{ "doclet.Help_line_8", "Direct Subclasses" },
 				{ "doclet.Help_line_9", "All Known Subinterfaces" },
 				{ "doclet.Help_title", "API Help" },
 				{ "doclet.Hide_Lists", "HIDE LISTS" },
 				{ "doclet.Hierarchy_For_All_Packages", "Hierarchy For All Packages" },
 				{ "doclet.Hierarchy_For_Package", "Hierarchy For Package {0}" },
 				{ "doclet.Href_Annotation_Title", "annotation in {0}" },
 				{ "doclet.Href_Class_Or_Interface_Title", "class or interface in {0}" },
 				{ "doclet.Href_Class_Title", "class in {0}" },
 				{ "doclet.Href_Enum_Title", "enum in {0}" },
 				{ "doclet.Href_Interface_Title", "interface in {0}" },
 				{ "doclet.Href_Type_Param_Title", "type parameter in {0}" },
 				{ "doclet.Implementing_Classes", "All Known Implementing Classes:" },
 				{ "doclet.Index", "Ãndice" },
 				{ "doclet.Index_of_Fields_and_Methods", "Index of Fields and Methods" },
 				{ "doclet.Inherited_API_Summary", "Inherited API Summary" },
 				{ "doclet.Interface_Hierarchy", "Interface Hierarchy" },
 				{ "doclet.Interfaces_Italic", "Interfaces (italic)" },
 				{ "doclet.Link_To", "Link to" },
 				{ "doclet.MEMBERS", "MEMBERS" },
 				{ "doclet.MalformedURL", "Malformed URL: {0}" },
 				{ "doclet.Method_in", "Method in {0}" },
 				{ "doclet.NONE", "NONE" },
 				{ "doclet.NO_FRAMES", "NO FRAMES" },
 				{ "doclet.Next", "PrÃ³ximo" },
 				{ "doclet.Next_Class", "NEXT CLASS" },
 				{ "doclet.Next_Letter", "NEXT LETTER" },
 				{ "doclet.Next_Package", "NEXT PACKAGE" },
 				{ "doclet.No_Non_Deprecated_Classes_To_Document", "No non-deprecated classes found to document." },
 				{ "doclet.No_Package_Comment_File", "For Package {0} Package.Comment file not found" },
 				{ "doclet.No_Source_For_Class", "Source information for class {0} not available." },
 				{ "doclet.Non_Frame_Version", "Non-frame version." },
 				{ "doclet.None", "None" },
 				{ "doclet.Note_0_is_deprecated", "Note: {0} is deprecated." },
 				{ "doclet.Option", "Option" },
 				{ "doclet.Or", "Or" },
 				{ "doclet.Other_Packages", "Other Packages" },
 				{ "doclet.Overrides", "Overrides:" },
 				{ "doclet.Overview", "VisÃ£o Geral" },
 				{ "doclet.Overview-Member-Frame", "Overview Member Frame" },
 				{ "doclet.Package", "Pacote" },
 				{ "doclet.Package_Description", "Package {0} Description" },
 				{ "doclet.Package_Hierarchies", "Package Hierarchies:" },
 				{ "doclet.Prev", "PREV" },
 				{ "doclet.Prev_Class", "PREV CLASS" },
 				{ "doclet.Prev_Letter", "PREV LETTER" },
 				{ "doclet.Prev_Package", "PREV PACKAGE" },
 				{ "doclet.Same_package_name_used", "Package name format used twice: {0}" },
 				{ "doclet.Serialization.Excluded_Class", "Non-transient field {1} uses excluded class {0}." },
 				{ "doclet.Serialization.Nonexcluded_Class", "Non-transient field {1} uses hidden, non-included class {0}." },
 				{ "doclet.Show_Lists", "SHOW LISTS" },
 				{ "doclet.Skip_navigation_links", "Skip navigation links" },
 				{ "doclet.Source_Code", "Source Code:" },
 				{ "doclet.Specified_By", "Specified by:" },
 				{ "doclet.Standard_doclet_invoked", "Standard doclet invoked..." },
 				{ "doclet.Static_method_in", "Static method in {0}" },
 				{ "doclet.Static_variable_in", "Static variable in {0}" },
 				{ "doclet.Style_Headings", "Headings" },
 				{ "doclet.Style_line_1", "Javadoc style sheet" },
 				{ "doclet.Style_line_10", "Navigation bar fonts and colors" },
 				{ "doclet.Style_line_11", "Dark Blue" },
 				{ "doclet.Style_line_2", "Define colors, fonts and other style attributes here to override the defaults" },
 				{ "doclet.Style_line_3", "Page background color" },
 				{ "doclet.Style_line_4", "Table colors" },
 				{ "doclet.Style_line_5", "Dark mauve" },
 				{ "doclet.Style_line_6", "Light mauve" },
 				{ "doclet.Style_line_7", "White" },
 				{ "doclet.Style_line_8", "Font used in left-hand frame lists" },
 				{ "doclet.Style_line_9", "Example of smaller, sans-serif font in frames" },
 				{ "doclet.Subclasses", "Direct Known Subclasses:" },
 				{ "doclet.Subinterfaces", "All Known Subinterfaces:" },
 				{ "doclet.Summary", "SUMMARY:" },
 				{ "doclet.The", "The" },
 				{ "doclet.Tree", "Ã" },
 				{ "doclet.URL_error", "Error fetching URL: {0}" },
 				{ "doclet.Variable_in", "Variable in {0}" },
 				{ "doclet.Window_ClassUse_Header", "Uses of {0} {1}" },
 				{ "doclet.Window_Class_Hierarchy", "Class Hierarchy" },
 				{ "doclet.Window_Deprecated_List", "Deprecated List" },
 				{ "doclet.Window_Help_title", "API Help" },
 				{ "doclet.Window_Overview", "Overview List" },
 				{ "doclet.Window_Overview_Summary", "Overview" },
 				{ "doclet.Window_Single_Index", "Index" },
 				{ "doclet.Window_Split_Index", "{0}-Index" },
 				{ "doclet.also", "also" },
 				{ "doclet.build_version", "Standard Doclet version {0}" },
 				{ "doclet.in_class", "{0} in class {1}" },
 				{ "doclet.in_interface", "{0} in interface {1}" },
 				{ "doclet.link_option_twice", "Extern URL link option (link or linkoffline) used twice." },
 				{ "doclet.navAnnotationTypeMember", "ELEMENT" },
 				{ "doclet.navAnnotationTypeOptionalMember", "OPTIONAL" },
 				{ "doclet.navAnnotationTypeRequiredMember", "REQUIRED" },
 				{ "doclet.navClassUse", "Use" },
 				{ "doclet.navConstructor", "CONSTR" },
 				{ "doclet.navDeprecated", "Depreciados" },
 				{ "doclet.navEnum", "ENUM CONSTANTS" },
 				{ "doclet.navFactoryMethod", "FACTORY" },
 				{ "doclet.navField", "Campos" },
 				{ "doclet.navMethod", "MÃ©todos" },
 				{ "doclet.navNested", "NESTED" },
 				{ "doclet.package", "pacote" },
 				{ "doclet.see.class_or_package_not_found", "Tag {0}: reference not found: {1}" },
 				{ "doclet.see.malformed_tag", "Tag {0}: Malformed: {1}" },
 				{ "doclet.throws", "throws" },
 				{ "doclet.usage", "Provided by Standard doclet:\n-d <directory>                    Destination directory for output files\n-use                              Create class and package usage pages\n-version                          Include @version paragraphs\n-author                           Include @author paragraphs\n-docfilessubdirs                  Recursively copy doc-file subdirectories\n-splitindex                       Split index into one file per letter\n-windowtitle <text>               Browser window title for the documenation\n-doctitle <html-code>             Include title for the overview page\n-header <html-code>               Include header text for each page\n-footer <html-code>               Include footer text for each page\n-top    <html-code>               Include top text for each page\n-bottom <html-code>               Include bottom text for each page\n-link <url>                       Create links to javadoc output at <url>\n-linkoffline <url> <url2>         Link to docs at <url> using package list at <url2>\n-excludedocfilessubdir <name1>:.. Exclude any doc-files subdirectories with given name.\n-group <name> <p1>:<p2>..         Group specified packages together in overview page\n-nocomment                        Supress description and tags, generate only declarations.\n-nodeprecated                     Do not include @deprecated information\n-noqualifier <name1>:<name2>:...  Exclude the list of qualifiers from the output.\n-nosince                          Do not include @since information\n-notimestamp                      Do not include hidden time stamp\n-nodeprecatedlist                 Do not generate deprecated list\n-notree                           Do not generate class hierarchy\n-noindex                          Do not generate index\n-nohelp                           Do not generate help link\n-nonavbar                         Do not generate navigation bar\n-serialwarn                       Generate warning about @serial tag\n-tag <name>:<locations>:<header>  Specify single argument custom tags\n-taglet                           The fully qualified name of Taglet to register\n-tagletpath                       The path to Taglets\n-charset <charset>                Charset for cross-platform viewing of generated documentation.\n-helpfile <file>                  Include file that help link links to\n-linksource                       Generate source in HTML\n-sourcetab <tab length>           Specify the number of spaces each tab takes up in the source\n-keywords                         Include HTML meta tags with package, class and member info\n-stylesheetfile <path>            File to change style of the generated documentation\n-docencoding <name>               Output encoding name" } };
   }
 }