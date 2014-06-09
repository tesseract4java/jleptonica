# BridJ bindings for Leptonica 1.70

This library is a wrapper around Leptonica.


## Usage

Before you can use this library, it has do be registered with BridJ:

~~~ java
BridJ.setNativeLibraryFile("leptonica",
    Paths.get("path/to/liblept.so").toFile()); // alternatively "liblept.dll"
~~~

**Note:** This is platform specific. Ensure you set the right path for the right
platform or let your users do it for you.

When the library has been set up, you can use it:

~~~ java
// create a 640x480 with 8 bits per pixel (grayscale)
Pointer<Pix> ppix = LibLept.pixCreate(640, 480, 8);

// do something with it

// destroy the pix when you don't need it any more
LibLept.pixDestroy(Pointer.pointerToPointer(ppix));
~~~

You can convert a `BufferedImage` to an instance of `Pix` and vice versa:

~~~ java
BufferedImage img = ImageIO.read(Paths.get("input.png").toFile());
Pointer<Pix> ppix = PixConversions.img2pix(img);
BufferedImage img2 = PixConversions.pix2img(ppix);

LibLept.pixDestroy(Pointer.pointerToPointer(ppix));
~~~


## License

It is released under the same license as Leptonica, the 2-clause BSD license:

~~~
Copyright (C) 2014 Paul Vorbach.
Copyright (C) 2001 Leptonica.  All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions
are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above
    copyright notice, this list of conditions and the following
    disclaimer in the documentation and/or other materials
    provided with the distribution.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
``AS IS'' AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
A PARTICULAR PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL ANY
CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY
OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
~~~
