import React from 'react'
import { makeStyles } from '@material-ui/core/styles'
import AppBar from '@material-ui/core/AppBar'
import Toolbar from '@material-ui/core/Toolbar'
import IconButton from '@material-ui/core/IconButton'
import HomeIcon from '@material-ui/icons/Home'
import { MoreHoriz, Settings } from '@material-ui/icons'
import { Typography, Container } from '@material-ui/core'
import { Link } from 'react-router-dom'

const useStyles = makeStyles({
    root: {
        flexGrow: 1,
        maxWidth: 500,
    },
})

const NavBar = () => {
    const classes = useStyles()
    const [value, setValue] = React.useState(0)

    return (
        <>
            <Container component="main">
                <AppBar position="static">
                    <Toolbar>
                        <IconButton size="small" component={Link} to="/">
                            <HomeIcon />
                            <Typography
                                variant="button"
                                className={classes.title}
                            >
                                Home
                            </Typography>
                        </IconButton>

                        <IconButton disabled={true} size="small">
                            <MoreHoriz />
                            <Typography
                                variant="button"
                                className={classes.title}
                            >
                                Details
                            </Typography>
                        </IconButton>

                        <IconButton size="small" component={Link} to="/admin">
                            <Settings />
                            <Typography
                                variant="button"
                                className={classes.title}
                            >
                                Admin
                            </Typography>
                        </IconButton>
                    </Toolbar>
                </AppBar>
            </Container>
        </>
    )
}

export default NavBar
