package com.learn.annotation;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.lang.reflect.Method;
import java.util.Set;

/**
 * Created by adam.rabczuk on 2017-08-01.
 */
@SupportedAnnotationTypes("com.learn.annotation.Methods")
public class MethodsProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {

        StringBuilder stringBuilder = new StringBuilder();

        for (Element element : roundEnv.getElementsAnnotatedWith(Methods.class)) {
            Methods impl = element.getAnnotation(Methods.class).getClass();

            for (Method method : element.getClass().getMethods()) {
                processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, method.getName());
            }
        }
        return true;
    }
}
