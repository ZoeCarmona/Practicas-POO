---
marp: true
author: Carmona Ayala Mariana Zoe, Lechuga Castillo Shareny Ixchel y Ochoa Lozano Miguel Angel
size: 4:3
theme: gaia
---
<style>
    :root {
        --color-background: #101010;
        --color-foreground: #FFFFFF;
    }

    h1 {
        font-family: Courier New;
    }
</style>

# MARKDOWN EN MARP

#### ¿Cómo crear presentaciones en Visual Studio Code?
- Carmona Ayala Mariana Zoe
- Lechuga Castillo Shareny Ixchel
- Ochoa Lozano Miguel Angel

---
# ¿Qué es?

- Mardown
    - Lenguaje de marcado que facilita la aplicación de formato a un texto. 
    - Emplea series de caracteres.
    - Herramienta usada por GitHub

- Marp
    - Permite escribir las presentaciones en formato Markdown, un lenguaje de marcado que nos permite estructurar y dar formato a un texto y crear presentaciones.

[//]: <> (Comentario)

---
# Extensiones
Para poder realizar presentaciones, se necesita instalar la siguiente extensión para poder visualizar nuestra presentación buscando su nombre en extensiones:

![marp for vscode align="center" width:830px height:320px](https://miro.medium.com/max/1400/1*q2A3V-Btl1zcogh3o7XbnA.png)


---
# Pasos
1.- Creamos un nuevo documento, asignandole el nombre que queramos.

2.- Agregamos el texto modelo, especificando que estamos usando marp ya que el documento no lo sabe por defecto:

    ---
    marp: true
    ---

---
Dentro de esta sección tambien podemos agregar datos como el autor, tamaño y tema de la presentación:

    ---
    marp: true
    author: nombre
    size: 4:3  
    theme: gaia
    ---

Al realizar esto, nuestra plantilla presentación estará creada, y la visualizaremos como una tipica hoja de Power Point en blanco

---
3.- Para visualizar la hoja, simplemente se da click en el icono de "preview" localizado en la parte de arriba de nuestro código

4.- Para crear nuevas hojas de nuestra prsentación, simplemente debemos de agregar "---", todo lo escrito dentro de estas lineas, conformará una hoja de la presentación

    ---
    Hoja 1 
    ---
    Hoja 2
    ---

---
# Sintaxis

Para escribir títulos, subtitulos, tachados, etc, se escribe de la siguiente manera en el documento:

1.- Títulos: # texto
2.- Viñetas: - texto
3.- Sub viñetas: (click tab) - texto
4.- Negritas: (doble *)texto(doble *)
5.- Italica: (guión bajo)texto(guión bajo)
6.- Tachado: (doble ~)texto(doble ~)
7.- Código: (')texto(')

---
## Visualización de Sintaxis 
# Titulo 
- viñeta
    - sub viñeta

**texto en negritas**
_texto italica_
~~texto tachado~~
'código'

---
# Imágenes
Para agregar imagenes a nuestra presentación, simplemnete debemos de escribir:

    ---
    ![Título de la imagen](link imagen) 
    ---

Si queremos ajustar el tamaño de nuesta imagen:

    ---
    ![titulo width:tamañopx height:tamañopx](direccion imagen)
    ---

---
# Comentarios

Para poder realizar comentarios dentro de nuestro documento y que no aparezcan en nuestra presentación, la forma ideal es la siguiente:

    ---
    [//]: <> (Comentario)
    ---

---
# Referencias
- [0] Que es Markdown. (2021, sept. 27). [Internet]. Disponible en: https://desarrolloweb.com/articulos/que-es-markdown.html 
- [1] Merino, M. (s.f.). Marp, la herramienta que nos permite crear presentaciones en modo texto usando Markdown. [Internet]. Disponible en: https://acortar.link/PgR8F8.
