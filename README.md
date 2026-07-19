# Design Patterns (Java)

This repository contains small Java examples for core design patterns.

## Included Patterns

1. **Builder Pattern** (`com.designpattern.creational.builder`)
2. **Observer Pattern** (`com.designpattern.structural.observerpattern`)
3. **Decorator Pattern** (`com.designpattern.structural.structure.decorator`)

## Pattern Overview

### Builder

- **Builder contract**: `ComputerBuilder`
- **Product**: `Computer`
- **Concrete builders**:
  - `GamingComputer`
  - `OfficeComputer`
- **Driver**: `CreateComputer`

Builds different computer configurations step-by-step while keeping object creation logic separated from representation.

### Observer

- **Observable/Subject**: `StocksObservable`, implementation `Iphoneobservable`
- **Observer contract**: `NotificationAlertObserver`
- **Concrete observers**:
  - `EmailAlertObserverImpl`
  - `MobileAlertObserverImpl`
- **Driver**: `Store`

When iPhone stock changes from zero, all subscribed observers are notified.

### Decorator

- **Component**: `Pizza`
- **Concrete components**:
  - `BasePizza`
  - `VegPizza`
  - `MargarittaPizza`
- **Decorator base**: `Decorator`
- **Concrete decorators**:
  - `PannerPizza`
  - `ChessPizza`
- **Driver**: `MainClass`

Adds toppings and incremental cost dynamically at runtime by wrapping pizza objects.

## Project Structure

- Source code: `src/`
- Compiled output (generated): `out/`

## How to Compile and Run (Windows PowerShell)

Run from the repository root (`Design-Pattern/`):

```powershell
New-Item -ItemType Directory -Force out | Out-Null
$sources = Get-ChildItem -Path .\src -Recurse -Filter *.java | ForEach-Object { $_.FullName }
javac -d .\out $sources
```

Run Builder example:

```powershell
java -cp .\out com.designpattern.creational.builder.CreateComputer
```

Run Observer example:

```powershell
java -cp .\out com.designpattern.structural.observerpattern.Store
```

Run Decorator example:

```powershell
java -cp .\out com.designpattern.structural.structure.decorator.MainClass
```

## Notes

- This project is focused on concept demonstration with console output.
- Naming is preserved from the existing implementation for consistency.
