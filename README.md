# Pi-calculator

This application uses integral calculus to estimate the digits of π as described in [this document](PI-Calculator-java/Taylor_Series__Pi_approximation.pdf).

## Usage

### Java

You can launch the program without any command-line arguments and it will not show intermediate steps, and iterate the sum 1 000 times.

#### Precision

You can use `-i` followed by the number of iteration you would like the sum to be executed. For instance:

```shell
java PiCalculator.java -i 25
```

...will iterate through the loop 25 times.

#### Show intermediate steps

By default, the program will not show the intermediate values of π. You can use `-s` to show them

```shell
java PiCalculator.java -s
```

### Python

Simply execute `calculateur_pi.py` using Python 3 on the terminal.

```shell
python3 calculateur_pi.py
```

The program will then ask you how many iteration of the loop you would like to run. If you would like 5 iteration of the loop for instance, you would enter 5.

```
Nombre de repetition de la boucle:

5
```