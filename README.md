# Design Patterns (Java)

This repository contains Java examples for two structural/behavioral design patterns:

1. **Observer Pattern** (`com.designpattern.structural.observerpattern`)
2. **Decorator Pattern** (`com.designpattern.structural.structure.decorator`)


## Pattern 1: Observer

- **Observable/Subject**: `StocksObservable` and implementation `Iphoneobservable`
- **Observers**: `NotificationAlertObserver` with implementations:
  - `EmailAlertObserverImpl`
  - `MobileAlertObserverImpl`
- **Driver**: `Store`

When stock is updated from zero, subscribed observers receive notifications.

## Pattern 2: Decorator

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

Decorators add toppings and cost on top of existing pizza objects at runtime.

## How to Run (Windows PowerShell)

From the repository root:

```powershell
New-Item -ItemType Directory -Force out | Out-Null
$sources = Get-ChildItem -Path .\src -Recurse -Filter *.java | ForEach-Object { $_.FullName }
javac -d .\out $sources
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

- The project currently demonstrates concepts with simple console output.
- Class names and messages are kept as-is from the current source.
