 package com.sun.tools.doclets.internal.toolkit.resources;
 
 import java.util.ListResourceBundle;
 
 public final class doclets extends ListResourceBundle
 {
   protected final Object[][] getContents()
   {
     return new Object[][] {
                { "tdoclet.All_Classes", "Todas as classes" },
				{ "tdoclet.All_Implemented_Interfaces", "All Implemented Interfaces:" },
				{ "tdoclet.All_Superinterfaces", "All Superinterfaces:" },
				{ "tdoclet.All_classes_and_interfaces", "All classes and interfaces (except non-static nested types)" },
				{ "tdoclet.AnnotationType", "Annotation Type" },
				{ "tdoclet.AnnotationTypes", "Annotation Types" },
				{ "tdoclet.Annotation_Type_Member_Detail", "Element Detail" },
				{ "tdoclet.Annotation_Type_Optional_Member_Summary", "Optional Element Summary" },
				{ "tdoclet.Annotation_Type_Required_Member_Summary", "Required Element Summary" },
				{ "tdoclet.Annotation_Types_Summary", "Annotation Types Summary" },
				{ "tdoclet.Author", "Author:" },
				{ "tdoclet.Building_Index", "Building index for all the packages and classes..." },
				{ "tdoclet.Building_Index_For_All_Classes", "Building index for all classes..." },
				{ "tdoclet.Building_Tree", "Building tree for all the packages and classes..." },
				{ "tdoclet.Class", "Class" },
				{ "tdoclet.Class_0_extends_implements_serializable", "Class {0} extends {1} implements Serializable" },
				{ "tdoclet.Class_0_implements_serializable", "Class {0} implements Serializable" },
				{ "tdoclet.Class_Summary", "Class Summary" },
				{ "tdoclet.Classes", "Classes" },
				{ "tdoclet.Constants_Summary", "Constant Field Values" },
				{ "tdoclet.Constructor_Detail", "Constructor Detail" },
				{ "tdoclet.Constructor_Summary", "Constructor Summary" },
				{ "tdoclet.Copy_Overwrite_warning", "File {0} not copied to {1} due to existing file with same name..." },
				{ "tdoclet.Copying_File_0_To_Dir_1", "Copying file {0} to directory {1}..." },
				{ "tdoclet.Copying_File_0_To_File_1", "Copying file {0} to file {1}..." },
				{ "tdoclet.Default", "Default:" },
				{ "tdoclet.Deprecated", "Deprecated." },
				{ "tdoclet.Deprecated_class", "This class is deprecated." },
				{ "tdoclet.Encoding_not_supported", "Encoding not supported: {0}" },
				{ "tdoclet.Enum", "Enum" },
				{ "tdoclet.Enum_Constant_Detail", "Enum Constant Detail" },
				{ "tdoclet.Enum_Constant_Summary", "Enum Constant Summary" },
				{ "tdoclet.Enum_Summary", "Enum Summary" },
				{ "tdoclet.Enums", "Enums" },
				{ "tdoclet.Error", "Error" },
				{ "tdoclet.Error_Summary", "Error Summary" },
				{ "tdoclet.Error_creating_tmp_file", "Error creating temporary file, using default platform encoding." },
				{ "tdoclet.Error_invalid_custom_tag_argument", "Error - {0} is an invalid argument to the -tag option..." },
				{ "tdoclet.Error_taglet_not_registered", "Error - Exception {0} thrown while trying to register Taglet {1}..." },
				{ "tdoclet.Errors", "Errors" },
				{ "tdoclet.Exception", "Exception" },
				{ "tdoclet.Exception_Summary", "Exception Summary" },
				{ "tdoclet.Exceptions", "Exceptions" },
				{ "tdoclet.Externalizable", "Externalizable" },
				{ "tdoclet.Factory", "Factory:" },
				{ "tdoclet.Factory_Method_Summary", "Static Factory Method Summary" },
				{ "tdoclet.Field_Detail", "Field Detail" },
				{ "tdoclet.Field_Summary", "Field Summary" },
				{ "tdoclet.Fields_Inherited_From_Class", "Fields inherited from class {0}" },
				{ "tdoclet.Fields_Inherited_From_Interface", "Fields inherited from interface {0}" },
				{ "tdoclet.File_not_found", "File not found: {0}" },
				{ "tdoclet.Generating_0", "Generating {0}..." },
				{ "tdoclet.Groupname_already_used", "In -group option, groupname already used: {0}" },
				{ "tdoclet.Interface", "Interface" },
				{ "tdoclet.Interface_Summary", "Interface Summary" },
				{ "tdoclet.Interfaces", "Interfaces" },
				{ "tdoclet.Members", "Members" },
				{ "tdoclet.Method_Detail", "Method Detail" },
				{ "tdoclet.Method_Summary", "Method Summary" },
				{ "tdoclet.Methods_Inherited_From_Class", "Methods inherited from class {0}" },
				{ "tdoclet.Methods_Inherited_From_Interface", "Methods inherited from interface {0}" },
				{ "tdoclet.MissingSerialDataTag", "in class {0}, missing @serialData tag in method {1}." },
				{ "tdoclet.MissingSerialTag", "in class {0}, missing @serial tag for default serializable field: {1}." },
				{ "tdoclet.Nested_Class_Summary", "Nested Class Summary" },
				{ "tdoclet.Nested_Classes_Interface_Inherited_From_Interface", "Nested classes/interfaces inherited from interface {0}" },
				{ "tdoclet.Nested_Classes_Interfaces_Inherited_From_Class", "Nested classes/interfaces inherited from class {0}" },
				{ "tdoclet.No_Public_Classes_To_Document", "No public or protected classes found to document." },
				{ "tdoclet.Notice_taglet_conflict_warn", "Note: Custom tags that could override future standard tags: {0}. To avoid potential overrides, use at least one period character (.) in custom tag names." },
				{ "tdoclet.Notice_taglet_overriden", "Note: Custom tags that override standard tags: {0}" },
				{ "tdoclet.Notice_taglet_registered", "Registered Taglet {0} ..." },
				{ "tdoclet.Notice_taglet_unseen", "Note: Custom tags that were not seen: {0}" },
				{ "tdoclet.Option_conflict", "Option {0} conflicts with {1}" },
				{ "tdoclet.Option_reuse", "Option reused: {0}" },
				{ "tdoclet.Other_Packages", "Other Packages" },
				{ "tdoclet.Package_Summary", "Package Summary" },
				{ "tdoclet.Package_class_and_interface_descriptions", "Package, class and interface descriptions" },
				{ "tdoclet.Package_private", "(package private)" },
				{ "tdoclet.Packages", "Packages" },
				{ "tdoclet.Parameters", "Parameters:" },
				{ "tdoclet.Parameters_dup_warn", "Parameter \"{0}\" is documented more than once." },
				{ "tdoclet.Parameters_warn", "@param argument \"{0}\" is not a parameter name." },
				{ "tdoclet.Return_tag_on_void_method", "@return tag cannot be used in method with void return type." },
				{ "tdoclet.Returns", "Returns:" },
				{ "tdoclet.See", "See:" },
				{ "tdoclet.See_Also", "See Also:" },
				{ "tdoclet.SerialData", "Serial Data:" },
				{ "tdoclet.Serializable", "Serializable" },
				{ "tdoclet.Serializable_no_customization", "No readObject or writeObject method declared." },
				{ "tdoclet.Serialized_Form", "Serialized Form" },
				{ "tdoclet.Serialized_Form_class", "Serialization Overview" },
				{ "tdoclet.Serialized_Form_fields", "Serialized Fields" },
				{ "tdoclet.Serialized_Form_methods", "Serialization Methods" },
				{ "tdoclet.Since", "Since:" },
				{ "tdoclet.Throws", "Throws:" },
				{ "tdoclet.Toolkit_Usage_Violation", "The Doclet Toolkit can only be used by {0}" },
				{ "tdoclet.TypeParameters", "Type Parameters:" },
				{ "tdoclet.Type_Parameters_dup_warn", "Type parameter \"{0}\" is documented more than once." },
				{ "tdoclet.Type_Parameters_warn", "@param argument \"{0}\" is not a type parameter name." },
				{ "tdoclet.Unable_to_create_directory_0", "Unable to create directory {0}" },
				{ "tdoclet.UnknownTag", "{0} is an unknown tag." },
				{ "tdoclet.UnknownTagLowercase", "{0} is an unknown tag -- same as a known tag except for case." },
				{ "tdoclet.Version", "Version:" },
				{ "tdoclet.annotationtype", "annotation type" },
				{ "tdoclet.class", "class" },
				{ "tdoclet.dest_dir_create", "Creating destination directory: \"{0}\"" },
				{ "tdoclet.destination_directory_not_directory_0", "Destination directory is not a directory {0}" },
				{ "tdoclet.destination_directory_not_found_0", "Destination directory not found {0}" },
				{ "tdoclet.destination_directory_not_writable_0", "Destination directory not writable {0}" },
				{ "tdoclet.enum", "enum" },
				{ "tdoclet.enum_valueof_doc", "\nReturns the enum constant of this type with the specified name.\nThe string must match <I>exactly</I> an identifier used to declare an\nenum constant in this type.  (Extraneous whitespace characters are \nnot permitted.)\n\n@param name the name of the enum constant to be returned.\n@return the enum constant with the specified name\n@throws IllegalArgumentException if this enum type has no constant\nwith the specified name\n@throws NullPointerException if the argument is null" },
				{ "tdoclet.enum_values_doc", "\nReturns an array containing the constants of this enum type, in\nthe order they are declared.  This method may be used to iterate\nover the constants as follows:\n<pre>\nfor ({0} c : {0}.values())\n&nbsp;   System.out.println(c);\n</pre>\n@return an array containing the constants of this enum type, in\nthe order they are declared" },
				{ "tdoclet.error", "error" },
				{ "tdoclet.exception", "exception" },
				{ "tdoclet.exception_encountered", "{0} encountered \n\twhile attempting to create file: {1}" },
				{ "tdoclet.extended_by", "extended by" },
				{ "tdoclet.extends", "extends" },
				{ "tdoclet.implements", "implementsdoclet.Same_package_name_used=Package name format used twice: {0}" },
				{ "tdoclet.in", "{0} in {1}" },
				{ "tdoclet.interface", "interface" },
				{ "tdoclet.malformed_html_link_tag", "<a> tag is malformed:\n\"{0}\"" },
				{ "tdoclet.noInheritedDoc", "@inheritDoc used but {0} does not override or implement any method." },
				{ "tdoclet.perform_copy_exception_encountered", "{0} encountered while \nperforming copy." },
				{ "tdoclet.sourcetab_warning", "The argument for -sourcetab must be an integer greater than 0." },
				{ "tdoclet.tag_misuse", "Tag {0} cannot be used in {1} documentation.  It can only be used in the following types of documentation: {2}." },
				{ "tdoclet.value_tag_invalid_constant", "@value tag (which references {0}) can only be used in constants." },
				{ "tdoclet.value_tag_invalid_reference", "{0} (referenced by @value tag) is an unknown reference." } };
   }
 }