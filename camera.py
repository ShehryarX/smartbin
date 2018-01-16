import picamera

# Snapa an image and save locally
def test_camera():
    with picamera.PiCamera() as camera:
        camera.capture('image.jpg')

# Debug
# if __name__ == '__main__':
#    test_camera()
