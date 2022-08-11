
def juros_compostos(valor, juros, meses):
    if meses <= 1:
        return valor + (valor * juros)
    return juros_compostos(valor + (valor * juros), juros, meses-1)

a = 10
print("hello world")
print(juros_compostos(1000, 0.01, 3))

from abc import ABC, abstractmethod
class Animal(ABC):
    def __init__(self):
        pass
    @abstractmethod
    def metodo_abstrato(self):
        pass
    def metodo_concreto(self):
        pass

class Cachorro(Animal):

    def metodo_abstrato(self):
        pass

    def metodo_concreto(self):
        super().metodo_concreto()


import tkinter as tk
from tkinter import ttk
from tkinter.messagebox import showerror

# root window
root = tk.Tk()
root.title('Temperature Converter')
root.geometry('600x150')
root.resizable(True, True)


def fahrenheit_to_celsius(f):
    """ Convert fahrenheit to celsius
    """
    return (f - 32) * 5/9


# frame
frame = ttk.Frame(root)


# field options
options = {'padx': 10, 'pady': 10}

# temperature label
temperature_label = ttk.Label(frame, text='Digite a temperatura em Fahrenheit')
temperature_label.grid(column=0, row=0, sticky='W', **options)

# temperature entry
temperature = tk.StringVar()
temperature_entry = ttk.Entry(frame, textvariable=temperature)
temperature_entry.grid(column=1, row=0, **options)
temperature_entry.focus()

# convert button


def convert_button_clicked():
    """  Handle convert button click event
    """
    try:
        f = float(temperature.get())
        c = fahrenheit_to_celsius(f)
        result = f'{f} Fahrenheit = {c:.2f} Celsius'
        result_label.config(text=result)
    except ValueError as error:
        showerror(title='Error', message="Valor inválido. Digite novamente.")


convert_button = ttk.Button(frame, text='Converter')
convert_button.grid(column=2, row=0, sticky='W', **options)
convert_button.configure(command=convert_button_clicked)

# result label
result_label = ttk.Label(frame)
result_label.grid(row=1, columnspan=3, **options)

# add padding to the frame and show it
frame.grid(padx=10, pady=10)


# start the app
root.mainloop()

import PyInstaller.__main__

PyInstaller.__main__.run([
    'main.py',
    '--onefile',
    '--windowed'
])