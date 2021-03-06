package jsinterop.generator.externs.dependency;


import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.generator.externs.dependency.parentthirdparty.ParentThirdPartyInterface;
import jsinterop.generator.externs.dependency.thirdparty.ThirdPartyClass;
import jsinterop.generator.externs.dependency.thirdparty.ThirdPartyInterface;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class SimpleClass extends ThirdPartyClass implements ThirdPartyInterface {
  public ThirdPartyClass field;

  public SimpleClass() {
    super((ThirdPartyClass.ConstructorFooUnionType) null);
  }

  public native ThirdPartyClass method(ThirdPartyInterface foo);

  public native void parentThirdpartyMethod(
      ParentThirdPartyInterface.ParentThirdpartyMethodFooType foo);
}
