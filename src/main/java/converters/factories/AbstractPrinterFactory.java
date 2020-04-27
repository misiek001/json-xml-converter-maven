package converters.factories;

import converters.components.Printer;

public abstract class AbstractPrinterFactory {

    public abstract Printer getComponentNodeWithNodePrinter();

    public abstract Printer getComponentNodeWithNodeListPrinter();

    public abstract Printer getNodeWithNoValuePrinter();

    public abstract  Printer getNodeWithValuePrinter();

    public abstract Printer getNodeListPrinter();

    public abstract Printer getNodeEqualListPrinter();
}
